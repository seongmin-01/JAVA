package Test4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜:2025/01/17
 * 이름:김성민
 * 내용:예외처리 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		
		int answer = (int) (Math.random()*10) +1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("---------------");
			System.out.println("answer의 값을 맞춰보세요.");
			System.out.print("1~10 사이의 값을 입력:");
			
			
		try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			
			if(input < 0) {  
				throw new Exception("음수는 입력 할 수 없습니다.");  //예외 던지기
			}
		}catch(InputMismatchException e) {   //받은 값이 올바르지 않을 경우?
			System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
			continue;  //현재 반복을 건너뛰고 다음 반복으로 넘어가게 하는 제어문임(이후의 코드가 아닌 다시 조건을 검사)
		}catch(Exception e) {
			System.out.println(e.getMessage());
			continue;
		}	
		
		if(answer > input) {
			System.out.println("더 큰 수를 입력하세요.");
		}else if(answer < input) {
			System.out.println("더 작은 수를 입력하세요.");
		}else {
			System.out.println("answer:" + answer);
			System.out.println("정답입니다.");
			System.out.println("시도 횟수:" + count + "회");
			break;
		}
	  }
		while(true);
		
		System.out.println("프로그램이 정상 종료 되었습니다.");
	}
}
