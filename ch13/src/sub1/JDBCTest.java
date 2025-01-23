package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜:2025/01/23
 * 이름:김성민
 * 내용:Java JDBC 접속 테스트 실습
 * 
 * JDBC
 * 	-Java Database Connection
 */
public class JDBCTest {
	public static void main(String[] args) {
		
		// DB정보 - DB와의 연결을 위해 DB정보가 필요
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 JDBC 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver"); //자바에서 라이브러리 패키지 정보를 로드 - 확장자는 빼주기
		
			// 2단계 데이터베이스 접속 - db에 접속하면 Connection 객체가 반환이 됨.
			Connection conn = DriverManager.getConnection(host,user,pass); //위에서 설정한 db정보가 담긴 변수를 넣어줌
			
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!");
			}
			else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
			//데이터베이스 종료
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
}
