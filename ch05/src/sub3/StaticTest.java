package sub3;
/*
 * 날짜:2025/01/08
 * 이름:김성민
 * 내용:Java 클래스 변수,메서드 실습하기
 * 
 * 클래스 변수, 클래스 메서드(정적 변수,정적 메서드)
 *  - static 키워드를 선언한 변수, 메서드
 *  - Method Area 메모리 영역에 생성
 *  - 객체를 생성하지 않고 직접 클래스 타입으로 사용
 *  - 객체들 간의 데이터 공유 목적으로 사용
 *  
 * 싱글톤 객체
 *  - static을 활용한 실글톤 객체는 오직 하나의 인스턴스로 메모리(method area)에 생성 
 *  - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상
 *  - static 인스턴스 생성, 인스턴스 Getter 정의, private 생성자 정의
 */
public class StaticTest {

	public static void main(String[] args) {
		
		//정적 변수, 정적 메서드
		Car sonata = new Car("소나타","흰색",10);
		Car avante = new Car("아반떼","검정",20);
		Car grande = new Car("그랜저","은색",30);
		
		sonata.show();
		System.out.println("================================");
		avante.show();
		System.out.println("================================");
		grande.show();
		
		//전체 차량 수
		
		//클래스 변수 - 객체가 아닌 클래스를 직접 참조함(Car라고 클래스명을 써줌)
		System.out.println("전체 차량 수: " + Car.count);
		
		//클래스 메서드 - 클래스명으로 메서드를 직접 호출
		System.out.println("전체 차량 수: " + Car.getcount());
		
		//Increment 실습
		//num1는 일반 맴버변수로써 각각 공간이 있기 때문에 객체 하나당 그 각각 공간을 가리킴 따라서 1출력
		//num2는 정적변수로써 공유되고 있기 때문에 하나의 공간에서 계속증감   3출력
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//싱글톤 실습
		Calc c1 = Calc.getInstance();   //참조변수는 2개지만 참조객체는 1개인거임
		
		int result1 = c1.plus(1, 2);
		System.out.println("result1: "+result1);
		
		Calc c2 = Calc.getInstance();
		int result2 = c2.mainus(5, 3);
		System.out.println("result2: " + result2);
	}
}
