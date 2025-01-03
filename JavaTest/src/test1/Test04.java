package test1;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력: ");
		int score = sc.nextInt();
		char grade = ' ';
		
		System.out.println("입력한 점수는" +score+"입니다.");
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80 && score < 90) {
			grade = 'B';
		}
		else if(score >= 70  && score < 80) {
			grade = 'C';
		}
		else if(score >= 60  && score < 70) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("등급은" + grade + "입니다.");
	}

}
