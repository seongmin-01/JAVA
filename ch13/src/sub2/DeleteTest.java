package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜:2025/01/23
 * 이름:김성민
 * 내용:Java CRUD 실습
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://localhost:3306/studydb";
		final String User = "root";
		final String Pass = "1234";
		
		try {
			
			//1단계 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 db 접속
			Connection conn= DriverManager.getConnection(Host,User,Pass);
			
			//3단계  SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계 sql 실행
			String sql = "delete from `user1` where `uid` = 'j101'"; 
			stmt.execute(sql);
			
			//5단계 조회결과 처리 여기도 삭제만 하기때문에 결과값 필요x
			
			//6단계 db 종료
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("delete 완료...");
	}
}
