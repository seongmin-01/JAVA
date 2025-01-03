package ch03;

/*
 * 날짜: 2024/01/02
 * 이름: 김성민
 * 내용: Java 제어문 if 복습하기
 */
public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90점 미만입니다.");
			System.out.println("등급은 B입니다.");
		}
		
		
		//if~else
		if(score < 90) {
			System.out.println("등급은 B입니다.");
		}
		else {
			System.out.println("등급은 A입니다.");
		}
		
		//else if
		
		if(score >= 90) {
			System.out.println("A등급입니다.");
		}
		else if(score >= 80) {
			System.out.println("B등급입니다.");
		}
		else if(score >= 70) {
			System.out.println("C등급입니다.");
		}
		else if(score >= 60) {
			System.out.println("D등급입니다.");
		}
		else {
			System.out.println("F등급입니다.");
		}
	}
	

}
