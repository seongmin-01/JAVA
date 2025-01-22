package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 날짜:2025/01/22
 * 이름:김성민
 * 내용:Java Socket 프로그래밍 실습
 */
public class SocketClient {
	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		
		try {
			socket = new Socket(); 
			
			System.out.println("연결 요청...");
			
			//loopback(127.0.0.1) 실습을 위해 상대방이 아닌 자기 자신에게 다시 응답을 함
			socket.connect(new InetSocketAddress("127.0.0.1", 5001)); //ip주소,포트번호
			
			System.out.println("연결 성공...");
			
			//데이터 송신
			OutputStream os  = socket.getOutputStream();
			String msg = "Hello Server!";
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes); // writer -> 데이터를 출력스트림으로 전송
			os.flush(); // 출력 스트림에서 데이터를 즉시 전송
			System.out.println("데이터 송신 완료...");
			
			//데이터 수신 (서버 -> 클라이언트)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100]; //버퍼장착
			int readBytes = is.read(bytes); //100글자씩 읽어드림
			
			//바이트 배열을 0부터(처음부터) 저장된 데이터를 인코딩하여 result에 저장함
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료...");
			
			os.close();
			is.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Client 종료...");
	}
}
