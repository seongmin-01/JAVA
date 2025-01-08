package sub2;
/*
 * 날짜:2025/01/07
 * 이름:김성민
 * 내용: Java 클래스 캡슐화 실습하기
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		
		Car sonata = new Car("소나타","흰색",10);
		
		
		
		//캡슐화된 속성은 외부에서 직접 참조할 수 없음
		//sonata.name = "소나타";
		//sonata.color = "검은색";
		//sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		
		/*
		 <출력>
		 차량명: 아반떼
		 차량색: 검정
		 현재속도: 20
		 */
		
		Car avante = new Car("아반떼","검정",10);
		
		avante.speedUp(80);
		avante.speedDown(70);
		avante.show();
		
		avante.setColor("흰색");  //setter를 이용해 속성 수정
		avante.show();
		
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명: 국민은행
		 계좌번호: 110-11-1011
		 입금주: 김유신
		 현재잔액: 10000
		 
		 김유신 -> 김유진 개명
		 */
		
		Account kb = new Account("국민은행","110-11-1011","김유신",0);
		
		kb.deposit(30000);
		kb.withdraw(20000);
		kb.show();
		
		kb.setName("김유진");
		kb.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명: 우리은행
		 계좌번호: 110-11-1211
		 입금주: 김춘추
		 현재잔액: 15000
		 
		 우리은행 -> 유리은행
		 */
		
		Account wr = new Account("우리은행","110-11-1211","김춘추",40000);
		wr.deposit(25000);
		wr.withdraw(50000);
		wr.show();
		
		wr.setBank("유리은행");
		wr.show();
		
		//문제1 Book 
		Book b1 = new Book("삼국지","나관중","10001",0);
		b1.show();
		
		boolean isOk = b1.borrowBook();
		if(isOk) {
			System.out.println(b1.getTitle() +"도서 대출 성공!");
		}
		else {
			System.out.println(b1.getTitle() +  "도서 대출 실패!");
		}
		b1.show();
		
		Book b2 = new Book("이것이 자바다","신용권","10002",10);
		b2.show();
		
		if(b2.borrowBook()) {
			System.out.println(b2.getTitle() + "도서 대출 성공!");
			
		}
		else {
			System.out.println(b2.getTitle() + "도서 대출 실패!");
		}
		
		
		//문제2 Movie
		Movie m1 = new Movie("인터스텔라","크리스토퍼놀란",9.12,0);
		m1.showDetails();
		
		boolean Ok = m1.reserveSeat();
		if(Ok) {
			System.out.println("예약 가능");
		}
		else {
			System.out.println("좌석이 매진되었습니다.");
		}
		
		Movie m2 = new Movie("타이타닉","제임스카메론",9.5,10);
		m2.showDetails();
		
		boolean Ok2 = m2.reserveSeat();
		if(Ok2) {
			System.out.println("예약 가능");
		}
		else {
			System.out.println("좌석이 매진되었습니다.");
		}
		
	}
}
