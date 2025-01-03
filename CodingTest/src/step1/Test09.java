package step1;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int a2 = (a+b)%c;
		int b2 = ((a%c)+(b%c))%c;
		int c2 = (a*b)%c;
		int d = ((a%c)*(b%c))%c;
		
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
		System.out.println(d);
	}
}
