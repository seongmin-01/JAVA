package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDelete {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://localhost/Bank";
		final String User = "root";
		final String Pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			String sql = "delete from `bank_customer` where `c_no` = '110-11-1100'";
			
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.executeUpdate();
			
			conn.close();
			psmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}
}
