package ch03.sec4;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10까지의 합 구하기
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합: " + sum);
		
		
		//구구단 2~9단까지 출력하기
		
		int num = 0;
		
		for(int x = 2; x <10; x++) {
			for(int y=1; y <10; y++) {
				
				num= x*y;
				System.out.println(x+"X" + y + "=" + num);
			}
		}
		
	}

}
