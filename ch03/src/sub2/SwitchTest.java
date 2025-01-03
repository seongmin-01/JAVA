package sub2;

/*
 * 날짜: 2025/01/02
 * 이름: 김성민
 * 내용: Java 조건문 switch문 실습하기
 * 
 */
import java.util.Scanner;  //Scanner라는 외부 라이브러리를 참조함.(출처임)

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("숫자 입력:");
		
		//사용자 입력(Scanner(클래스임)라는 외부 라이브러리를 import하여 사용함)
		Scanner sc = new Scanner(System.in);
		
		//키보드로 입력된 숫자를 받아서 number변수에 입력받은 값을 저장함.
		int number = sc.nextInt();  // nextInt -> 정수만 입력받는 함수.
		
		System.out.println("입력 숫자 : " + number);  //입력받은 숫자의 값이 담긴 number변수의 값을 출력
		
		
		//switch -> 주어진 조건의 값을 가지고 따짐. (if문은 조건식을 따짐)  - 두 조건문의 차이점.
		switch(number % 2) {
		case 0:
			System.out.println("number는 짝수");
			break;
			
		case 1:
			System.out.println("number는 홀수");
			break;
			
		default:
			System.out.println("number는 숫자가 아닙니다.");
			break;
		}
	}

}
