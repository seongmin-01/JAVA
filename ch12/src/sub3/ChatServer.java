package sub3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜:2025/01/22
 * 이름:김성민
 * 내용:Java Socket 프로그래밍 실습 채팅프로그래밍 만들기
 */
public class ChatServer {
	public static void main(String[] args) {
		
		System.out.println("[Sever]");
		
		ServerSocket serverSocket = null;  
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9001);
			System.out.println("연결 대기...");
			socket = serverSocket.accept();  // accept -> 서버소켓에서 클라이언트 연결요청 수락
			System.out.println("연결 수립...");
			
			Thread receiver = new ReceiverThread(socket); //수신
			Thread sender = new SenderThread(socket);  //송신
			
			receiver.start();
			sender.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("Server 채팅 종료...");
	}
}
