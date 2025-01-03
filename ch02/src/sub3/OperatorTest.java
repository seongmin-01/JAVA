package sub3;

/*
 * 날짜: 2024/12/31
 * 이름: 김성민
 * 내용: Java 연산자 실습하기
 */

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 변수이름 정의 규칙
		 * 이름 중복 x (구분되어야 함)
		 * 소문자 시작
		 * 특수문자 시작x
		 */
		
		//산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;  //나눗셈 - 몫을 출력
		int result5 = num4 % num3;  //나눗셈 - 나머지를 출력
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		
		//증감연산자
		int num = 0; //변수 초기화(초기값을 0으로 지정)
		System.out.println("num :" + num);
		
		num++; //카운팅(변수의 값을 1증가)
		System.out.println("num :" + num);
		
		++num;
		System.out.println(num);
		
		num--;
		System.out.println(num);
		
		--num;
		System.out.println(num);
		
		//복합대입연산자
		int n1 = 1, n2 =2, n3 = 3, n4 = 4;
		
		n1 += 1;  // n1 + 1이랑 같은 결과
		n2 -= 2;
		n3 *= 3;
		n4 /= 4;
				
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		//비교연산자
		
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2;
		boolean rs2 = var1 < var2;
		boolean rs3 = var1 >= var2;
		boolean rs4 = var1 <= var2;
		boolean rs5 = var1 == var2;
		boolean rs6 = var1 != var2;    //아닐경우(다를경우)에 !=비교연산자를 사용
		
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		System.out.println(rs4);
		System.out.println(rs5);
		System.out.println(rs6);
		
		//논리연산자
		
		int var3 = 3;
		int var4 = 4;
		
		//&&(그리고)AND -> 두 항이 다 참이여야 true,  둘 중 하나라도 틀리면 false
		boolean res1 = (var3 > 3) && (var4 > 3);  
		System.out.println("res1 : " + res1); 
		
		boolean res2 = (var3 > 2) && (var4 > 3);
		System.out.println("res2 : " + res2);
		
		// ||(또는)OR -> 둘 중 하나만 참이여도 true 둘다 틀리면 false
		boolean res3 = (var3 > 3) || (var4 > 3);
		System.out.println("res3 : " + res3);
		
		boolean res4 = (var3 > 3) || (var4 > 5);
		System.out.println("res4 :" + res4);
		
		//!(부정하다)NOT -> 해당 결과 의 반대로 나옴
		boolean res5 = !(var3 > var4);  // 3은 4보다 작음으로 false인데 !을 사용하여서 반대인 true가 나옴.
		System.out.println("res5 :" + res5);
		
		//비트연산자는 하드웨어적인 작업을 할 것이 아니면 사용안함
	}

}
