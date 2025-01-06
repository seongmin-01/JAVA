package sub02;
/*
 * 날짜:2025/01/06
 * 이름:김성민
 * 내용: Java 메서드 타입 실습하기
 */
public class MathodTypeTest {
	public static void main(String[] args) {
		
		//메서드 호출
		double y1 = type1(1.2);  //인자값: 메서드를 호출할 때 전달하는 값
		
		double y2 = type1(2.7);
		
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		
		type2(true);   //반환값이 없으므로 메서드 앞에 대입 연산자(=) 없음.
		type2(false);
		
		boolean result = type3();
		System.out.println(result);
		
		type4();
		
	}
	
	//타입1: 매개변수 O, 반환값 O
	public static double type1(double r) {
		
		double y = (r * r) +3.14;
		return y;
	}
	
	//타입2: 매개변수 O, 반환값 X
	
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참입니다.");
		}
		else {
			System.out.println("거짓입니다.");
		}
	}
	//타입3: 매개변수 X, 반환값 O
	
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//타입4: 매개변수 X, 반환값 X
	
	public static void type4() {
		double result = type1(2.3);
		System.out.println("반지름 2.3인 원의 넓이: " + result);
	}
}
