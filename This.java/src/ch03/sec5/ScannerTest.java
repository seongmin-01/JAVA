package ch03.sec5;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner를 이용한 입력받은 두 수의 곱 구하기
		System.out.println("두 개의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		 System.out.println("입력 숫자: " + number);
		 
		int number2 = sc.nextInt();
		System.out.println("입력 숫자: " + number2);
		
		int result = number * number2;
		
		System.out.println("입력받은 숫자의 곱은 :" + result + "입니다.");
		
		
		
	}

}
