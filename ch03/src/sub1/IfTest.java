package sub1;

/*
 * 날짜: 2025/01/02
 * 이름: 김성민
 * 내용: Java 조건문 if 실습하기
 */
public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 디버그모드
		 * //해당 코드의 줄에 더블클릭 후 디버그(벌레모양) 버튼을 클릭하면 한줄 씩 실행하게됨. F6번을 누르면서 하나씩 실행결과 확인  
		 * 끝나면 다시 개발모드로 바꾸기
		 * 변수안의 값 확인이랑 디버깅 할 때 사용함.
		 */
		
		//======================================================================================
		
		//if : 조건식이 true일 경우 if문안의 코드블럭이 실행이되지만 false이면 실행이 되지 않음.
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) { //조건식이 true이므로
			System.out.println("num1은 num2보다 작다."); //해당 코드가 실행됨.	
		}
		
		if(num1 > 1) {   //조건식이 false이므로  
			System.out.println("num1은 1보다 크다"); //이 코드가 실행되지 않음
		}
		
		//======================================================================================
		
		//중복 if문
		if(num1 > 0) {  //해당 조건 true이므로 if문 안의 코드블럭으로 내려감.
			if(num2 > 1) {  //if문안의 if문도 true이므로 2번째 if문안의 
				System.out.println("중복 if문 : num1은 0보다 크고 num2는 1보다 크다."); //해당 코드가 실행이됨
			}
		}
		
		//논리연산자(&&)를 활용하여 위의 중복if문의 코드를 한번에 실행 
		if(num1 > 0 && num2 > 1) {  //두가지의 조건이 다 true이므로  
			System.out.println("num1은 0보다 크고 num2는 1보다 크다."); //해당 코드가 실행이됨
		}
		
		
		//======================================================================================
		
		//if ~ else : 조건에 따라 true인 경우와 false인 경우를 둘다 처리함 
		int var1 =1 ,var2 = 2;
		
		if(var1 > var2) {
			System.out.println("if~else문 : var1이 var2보다 크다.");
		}
		else {
			System.out.println("if~else문 : var1이 var2보다 작다.");
		}
		
		
		//======================================================================================
		
		//else if (if ~ else  if ~ else)
		int n1 = 1, n2 = 20, n3 = 3, n4 = 4;
		
		//조건1
		if(n1 > n2) {   //해당 조건이 true면   
			System.out.println("n1은 n2보다 크다.");     //해당 코드 블럭을 실행하고 끝남.(조건문을 빠져나옴)
		}
		
		//조건2   -> 조건1의 조건이 false면
		else if(n2 > n3) {    //해당 조건을 따지고 참이면 
			System.out.println("n2는 n3보다 크다."); //해당 코드 블럭을 실행 거짓이면 다시 밑으로 넘어감
		}
		
		//조건3
		else if(n3 > n4) {  
			System.out.println("n3는 n4보다 크다.");
		}
		else {
			System.out.println("n4가 가장크다.");
		}
	}

}
