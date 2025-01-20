package sub2;
/*
 * 날짜:2025/01/20
 * 이름:김성민
 * 내용:Java 스레드 상태 실습하기 (join)
 */

class WorkThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("WorkTread..." + i);
			
			try {
				Thread.sleep(1000);  //1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("WorkThread 종료...");
	}
	
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		//스레드 실행
		work.start();
		
		//main 스레드가 work 스레드 종료 대기 
		try {
			work.join();  //workThread가 작업이 종료될 때까지 메인이 기다림 -> main스레드가 일시정지상태로 빠짐
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료...");  // 메인스레드 종료 = 프로그램 종료
		
	}
}
