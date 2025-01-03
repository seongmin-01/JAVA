package test1;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int num = 1;
		
		result = num++;   // ++가 뒤에오면 대입연산자 = 보다 후 순위임. 따라서 먼저 대입됬기때문에 2가 아닌 1이 출력됨.
		System.out.println("result: " +result);
		
		result = ++num;
		System.out.println("result: " + result);
		
		result = num--;
		System.out.println("result: " + result);
		
		result = --num;
		System.out.println("result: " + result);
	}

}
