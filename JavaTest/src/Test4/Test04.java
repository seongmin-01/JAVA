package Test4;
/*
 * 날짜:2025/01/17
 * 이름:김성민
 * 내용:자바 문자열 연습문제
 * 
 * 한번 더 볼 것!
 */
public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");  //파일명과 확장자를 분리해야함
		
		String title = fileName.substring(0,idx); //첫번째 부터 .전까지 
		String ext = fileName.substring(idx+1); // .이후이므로 +1을 해줌
	
		System.out.println("파일명: " + title);
		System.out.println("확장자: " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");  //문자열을 ,로 구분시킴
		
		int total = 0;
		
		for(String score : scores) {
			//위에서 자른 문자열이 72부터는 앞에 공백이 붙음 -> 숫자로 변환할 수 있는 값의 형태가 아님 따라서 공백을 제거해주어야함.
			total += Integer.parseInt(score.trim());  //trim() -> 공백문자열을 제거하는 것
		}
		System.out.println("strScores총점: " + total);
	}
}
