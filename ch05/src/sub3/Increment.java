package sub3;
/*
 * 날짜:2025/01/08
 * 이름:김성민
 * 내용:Java 클래스 변수, 메서드 실습
 */
public class Increment {

	//일반 변수
	private int num1;
	
	// 클래스 변수(정적 변수)
	private static int num2;  
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
	
	
}
