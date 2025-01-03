package ch02.sec02;

//p45 실습하기
public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000; 컴파일러는 int로 간주하기 때문에 에러 발생
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
