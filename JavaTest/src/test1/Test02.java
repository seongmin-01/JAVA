package test1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력: " );
		year = sc.nextInt();
		System.out.print("태어난 년도 입력: " );
		birth = sc.nextInt();
		
		sc.nextLine(); // 버퍼 비우기 (이 부분 추가)
		System.out.print("이름 입력: " );
		name = sc.next();
		
		int age = year - birth;
		
		System.out.print(name +"님 안녕하세요. \n당신은 올해 만"+ age+ "세 입니다."); //문자열은 %s, 숫자는 %d
		
		sc.close();
	}

}
