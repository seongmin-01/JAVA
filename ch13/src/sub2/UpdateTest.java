package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜:2025/01/23
 * 이름:김성민
 * 내용:Java CRUD 실습
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		//DB정보
		final String Host = "jdbc:mysql://localhost:3306/studydb";
		final String User = "root";
		final String Pass = "1234";
		
		
		try {
			
			//1단계 db드라이브 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2단계 db 접속
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			//3단계 sql 실행 객체 생성
			Statement stmt = conn.createStatement();
 			
			//4단계 sql 실행
			String sql = "update `user1` set `name`='김유진', `hp` = '010-1234-1011' "
					+ " where `uid` = 'j101' ";
			
			stmt.execute(sql);
			
			//5단계 여기도 데이터 수정만 하기 때문에 결과를 처리해줄 필요가 없음
			
			//6단계
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}
}
