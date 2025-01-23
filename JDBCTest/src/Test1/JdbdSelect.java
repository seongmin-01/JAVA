package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbdSelect {
	public static void main(String[] args) {
		final String Host = "jdbc:mysql://localhost:3306/Bank";
		final String User = "root";
		final String Pass = "1234";
		
		List<Customer> ct = new ArrayList<Customer>();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			String sql = "select * from `bank_customer`";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
		
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				Customer ct1 = new Customer();
				
				ct1.setC_no(rs.getString(1));
				ct1.setC_name(rs.getString(2));
				ct1.setC_dist(rs.getInt(3));
				ct1.setC_phone(rs.getString(4));
				ct1.setC_addr(rs.getString(5));
				
				ct.add(ct1);
			}
			
			conn.close();
			psmt.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(Customer rc : ct) {
			System.out.println(rc);
		}
		System.out.println("select 완료...");
	}
}
