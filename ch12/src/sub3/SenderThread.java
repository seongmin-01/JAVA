package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 날짜:2025/01/22
 * 이름:김성민
 * 내용:Java 채팅(병렬처리)를 위한 멀티 스레드 실습
 */
public class SenderThread extends Thread{
private Socket socket;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			
			//사용자의 입력을 받기 위한 객체
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//PrintWriter -> 출력 스트림에서 문자 데이터를 출력
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
				}
				
				writer.println(msg); //writer -> 출력 스트림으로 전송
				writer.flush();  // 출력스트림의 값을 즉시 전송
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
