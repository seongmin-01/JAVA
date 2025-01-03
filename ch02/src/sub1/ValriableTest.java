package sub1;

/*
 * 날짜: 2024/12/31
 * 이름: 김성민
 * 내용: ch02.변수와 연산자
 * 
 */

public class ValriableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수
		int a = 3;  //변수 초기화(변수에 최초의 값을 저장)
		int b = 7;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		a = 5;     //재할당(변수의 값을 다시 저장)
		b = 9;
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		
		//상수
		final int NUM = 5;  //final : 상수를 정의할 떄 사용함.(대문자를 사용하는 것이 관례임)
		System.out.println("num: " + NUM);
		
		
	}

}
