package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 날짜:2025/01/22
 * 이름:김성민
 * 내용:Java 채팅(병렬처리)를 위한 멀티 스레드 실습
 */

//수신처리 스레드 클래스
public class ReceiverThread extends Thread{
	
	private Socket socket;
	
	public ReceiverThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//BufferedReader -> 입력 스트림에서 데이터를 읽기 위한 클래스
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				}
				System.out.println(msg);
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
