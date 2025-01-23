package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTest {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://localhost:3306/Bank";
		final String User = "root";
		final String Pass = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			String sql = "update `bank_customer` set `c_addr` = ? where `c_no` = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "부산시 강서구");
			psmt.setString(2, "220-82-52237");
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("update 되었습니다.");
	}
}
