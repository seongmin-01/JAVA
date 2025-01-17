package Test4_1;

public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0,idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명: " + title);
		System.out.println("확장자: " + ext);
		
		String strScore = "60, 72, 82, 86, 92";
		String[] scores = strScore.split(",");
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score.trim());
		}
		System.out.println("strScores총점: " + total);
	}
}
