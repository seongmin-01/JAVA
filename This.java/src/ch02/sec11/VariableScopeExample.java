package ch02.sec11;

//p69 실습하기
public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;
	}

}
