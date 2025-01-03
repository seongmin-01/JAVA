package ch01;

/*
 * 날짜:2024/12/31
 * 이름:김성민
 * 내용:출력테스트
 *  
 *  여러줄 주석: /*
 *  한줄 주석: // 
 */

public class PrintTest {

	public static void main(String[] args) {
		//기본출력
		System.out.println("Hello java!");
		System.out.println("Hello Korea!");
		System.out.println("Hello Busan!");
		
		//한줄출력
		System.out.print("Welcome");  //ln -> line : 줄바꿈(개행) 처리가 안되기 때문에 한줄에 다 출력되는 것임.
		System.out.print("Java!");
		System.out.print("Spring");
		
		//개행출력
		System.out.println();   //줄바꿈(개행)
		System.out.print("Greeting\n");  // \n : 이스케이프 문자로 줄바꿈(개행) 처리
		System.out.print("java");
		
	}

}
