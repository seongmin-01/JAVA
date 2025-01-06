package sub01;
/*
 * 날짜:2025/01/06
 * 이름:김성민
 * 내용: Java 배열 실습하기
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 배열 - 참조타입임.
		int[]    arr1 = {1, 2, 3, 4, 5};
		char[]   arr2 = {'A','B','C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		System.out.println(arr1);  
		System.out.println(arr2);
		System.out.println(arr3);
		
		// 배열값 참조
		System.out.println("arr1[0]: " +arr1[0]);
		System.out.println("arr1[2]: " +arr1[2]);
		System.out.println("arr1[3]: " +arr1[3]);
		
		System.out.println("arr2[1]: " +arr2[1]);
		
		
		System.out.println("arr3[1]: " +arr3[1]);
		System.out.println("arr3[3]: " +arr3[3]);
		System.out.println("arr3[4]: " +arr3[4]);
		
		// 배열 길이
		System.out.println("arr1 길이: " +arr1.length);    //length는 배열의 길이를 출력하는 메서드임.
		System.out.println("arr2 길이: " +arr2.length);
		System.out.println("arr3 길이: " +arr3.length);
		
		
		// 배열의 반복문
		for(int i=0; i<arr1.length; i++) {   //배열의 length를 가지고 반복문을 사용할 수 있음.
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		for(char c : arr2) {    //배열의 길이만큼 반복하면서 배열 원소를 변수 c에 대입
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		for(String s : arr3) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92};   //배열이름은 복수형태 's'를 붙여서 네이밍
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		System.out.println("scores의 합계: " + total);
		
		
		// 2차원 배열  (행,열)
		int[][] arr2d = {{1, 2, 3, 4}, 
						 {5, 6, 7, 8}, 
						 {9, 10, 11, 12}};
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<4; b++) {
				
				System.out.println("arr2d["+a+"]["+b+"] :" + arr2d[a][b]);
			}
		}
		
		// 3차원 배열  (면,행,열)
		
		int[][][] arr3d = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 
						  {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
						  {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};
		
		for(int a=0; a <3; a++) {
			
			for(int b=0; b<3; b++) {
				
				for(int c=0; c<3; c++) {
					
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c] );
				}
			}
		}
		
	}
}