package sub3;

/*
 * 날짜: 2025/01/02
 * 이름: 김성민
 * 내용: Java 반복문 for 실습하기
 */
public class ForTest {

	public static void main(String[] args) {
		//for (초기식; 조건식; 증감식) - 초기식은 대부분 반복함수(int-i를 사용함)
		for(int i=0; i<10; i++) {
			System.out.println("i: " + i);  //조건식의 결과를 가지고 다시 조건식을 따져서 만족할 때까지 반복함.
		}
		
		//1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {			
			sum += k; //sum = sum + k;
		}
		System.out.println("1부터 10까지 합: " + sum);
		
		//1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1; k<=10; k++) {
			if(k%2 == 0) {
				tot += k;
			}
		}
		System.out.println("1부터 10까지 짝수합: " + tot);
		
		//for중첩 1번의 for문이 한번 실행될 때 2번째 for문은 다 한사이클을 돌아감
		
		for(int a=1; a<=3; a++) {
			System.out.println("a: " + a);
			
			for(int b=1; b<=5; b++) {
				System.out.println("b: " + b);
				
				for(int c=1; c<=7; c++) {
					System.out.println("c :" +c);
				}
			}
		}
		
		//구구단
		for(int x=2; x<10; x++) {
			for(int y=1; y<10; y++) {
				System.out.println(x + "x" + y + "=" + x*y);
			}
		}
		
		//별삼각형
		for(int start=10; start >= 1; start--) {
			for(int end=1; end<=start; end++) {
				System.out.print("★");
			}
			System.out.print("\n"); //개행(줄바꿈처리)
		}
		
	}

}
