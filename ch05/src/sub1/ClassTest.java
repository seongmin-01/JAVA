package sub1;
/*
 * 날짜:2025/01/07
 * 이름:김성민
 * 내용:Java 클래스 실습하기 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		// Car 객체 생성
		Car sonata = new Car();
		
		//객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 상호작용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		//객체 선언
		Car avante;
		
		//객체 생성
		avante = new Car();  //생성자
		
		//객체 초기화
		avante.name = "아반떼";
		avante.color = "흰색";
		avante.speed = 10;
		
		//객체 상호작용
		avante.speedUp(70);
		avante.speedDown(20);
		avante.show();
		
		
		//Account 객체 생성
		Account kakao = new Account();
		
		//객체 초기화
		kakao.bank = "카카오뱅크";
		kakao.id = "3333-14-1231234";
		kakao.name = "홍길동";
		kakao.balance = 30000;
		
		//객체 상호작용
		
		kakao.deposit(100000);
		kakao.withdraw(35000);
		kakao.show();
		
		/*
		 <출력>
		 은행명 : 우리은행
		 계좌번호 : 110-11-1021
		 입금주 : 김춘추
		 현재 잔액 : 15000 
		 */
		
		Account or = new Account();
		
		or.bank = "우리은행";
		or.id = "110-11-1021";
		or.name = "김춘추";
		or.balance = 0;
		
		or.deposit(30000);
		or.withdraw(15000);
		or.show();
		
				
	}
}
