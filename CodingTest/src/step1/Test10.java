package step1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int r1 = n2 % 10;
		int r2 = (n2/10)%10;
		int r3 = n2/100;
		
		System.out.println(n1 * r1);
		System.out.println(n1 * r2);
		System.out.println(n1 * r3);
		System.out.println(n1 * n2);
	}
}
