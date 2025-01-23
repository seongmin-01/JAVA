package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

/*
 * 날짜:2025/01/23
 * 이름:김성민
 * 내용:Java CRUD 실습
 */
public class InsertTest {
	public static void main(String[] args) {
		
		// DB정보 - DB와의 연결을 위해 DB정보가 필요(바뀔필요가 없으므로 상수로정의)
		final String Host = "jdbc:mysql://127.0.0.1:3306/studydb"; //DB주소
		final String User = "root";
		final String Pass = "1234";
		
		try {
			
			//1단계 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver"); //로드 - 클래스를 객체로 생성한다
			
			//2단계 데이터베이스 접속
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			//3단계 SQL 실행 객체 생성
			Statement stmt = conn.createStatement(); //Statement객체 - sql문을 실행
			
			//4단계 SQL 실행
			String sql = "Insert into `user1` value('j101','김유신','010-1234-1001',23)";
			 stmt.execute(sql); 
			
			//5단계 ResultSet 결과 처리(Select 경우) - 지금 예제에서는 insert만 하였기 때문에 아직 필요없음
						
			//6단계 데이터베이스 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("insert 완료...");
	}
}
