package step2;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int price = 0;
		
		if(a == b && b == c) {
			 price = 10000+(a*1000);
		}
		else if(a==b || a ==c) {
			price = 1000+(a*100);
		}
		else {
			int max = Math.max(a, Math.max(b, c));
            price = max * 100;
		}
		
		System.out.println(price);
		sc.close();
	}
}
