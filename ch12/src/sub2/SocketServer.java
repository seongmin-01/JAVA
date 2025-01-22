package sub2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜:2025/01/22
 * 이름:김성민
 * 내용:Java Socket 프로그래밍 실습
 */
public class SocketServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1",5001)); //bind -> 클라이언트의 연결 준비 
			System.out.println("연결 대기...");
			
			Socket socket = serverSocket.accept(); //accept -> 연결을 수락
			System.out.println("연결 수립...");
			
			//데이터 수신
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100]; //버퍼장착
			int readBytes = is.read(bytes); //100글자씩 읽어드림
			
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			System.out.println("데이터 수신 완료...");
			
			//데이터 송신 (서버 -> 클라이언트)
			OutputStream os  = socket.getOutputStream();
			String msg = "Hello Client!";
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			System.out.println("데이터 송신 완료...");
			
			os.close();
			is.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Server 종료...");
	}
}
