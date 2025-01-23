package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜:2025/01/23
 * 이름:김성민
 * 내용:Java CRUD 실습
 */
public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		String Host = "jdbc:mysql://localhost:3306/studydb";
		String User = "root";
		String Pass = "1234";
		
		try {
			//1단계 jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 db접속
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			//3단계 실행 객체 생성
			String sql = "update `user1` set `name` =? , `hp`=?, `age` =? ";
				   sql += "where `uid` = ?";	   
				  
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			//쿼리 파라미터 순서에 맞게 작성해야함 -> db 컬럼명 순서x
			psmt.setString(1, "장민혁");
			psmt.setString(2, "010-1234-1003");
			psmt.setInt(3, 24);
			psmt.setString(4, "A101");
			
			
			System.out.println(psmt);
			
			//4단계 sql 실행
			psmt.execute();
			
			//5단계 
			
			//6단계 db종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}
