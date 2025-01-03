package sub2;

/*
 * 날짜: 2024/12/31
 * 이름: 김성민
 * 내용: Java 자료형 실습하기
 */
public class DataTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형 
		//요즘은 메모리 사양이 기본적으로 좋아서 int부터 바로 사용해도 됨.(더 작은 단위는 메모리를 효율적으로 사용하기 위해 사용함.)
		//노란줄 - 불필요한 부분을 차지? 하고 있다. (에러는 아님) 변수를 선언만하고 사용을 하지않아도 발생함
		byte num1 = 127;
		short num2 = 32767;
		int num3 = 2147483647;
		long num4 = 922337203685477508L; //long타입은 마지막에 접미사로 L을 붙여주어야함.
		
		
		System.out.println("num1 :" + num1); //ctrl+alt 방향키 밑으로 (복사)
		System.out.println("num2 :" + num2);
		System.out.println("num3 :" + num3);
		System.out.println("num4 :" + num4);
		
		//실수형
		float var1 = 0.123456789f;   //소수점 8자리까지 출력. (접미사로 f를 붙여야함)
		double var2 = 0.123456789123456789;   //소수점 17자리까지 출력.
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		//논리형(참,거짓)
		boolean data1 = true;     
		boolean data2 = false;
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		
		//문자형(''- 작은 따움표를 사용해야함) - 문자 하나를 저장하는 자료형임
		char c1 = 'A'; 
 		char c2 = '가';
		
 		System.out.println("c1: " + c1);
 		System.out.println("c2: " + c2);
 		
		//문자열
		String word1 = "A";
		String word2 = "가";
		String word3 = "Apple";
		String word4 = "가을";
		
		
		System.out.println("word1: " + word1);
		System.out.println("word2: " + word2);
		System.out.println("word3: " + word3);
		System.out.println("word4: " + word4);
		
	}

}
