package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://localhost:3306/Bank";
		final String User = "root";
		final String Pass = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			String sql = "insert into `bank_customer` value(?, ?, ?, ?, ?)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "110-11-1100");
			psmt.setString(2, "홍길동");
			psmt.setInt(3, 3);
			psmt.setString(4, "010-1234-1231");
			psmt.setString(5, "부산시 금정구");
			
			
			psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("insert 완료...");
	}
}
