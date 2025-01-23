package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Tranction {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://localhost:3306/bank";
		final String User = "root";
		final String Pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생하시겠습니까?");
		
		int answer = sc.nextInt();
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(Host,User,Pass);
			
			//sql문이 하나씩 실행되는것을 막기위함
			conn.setAutoCommit(false);
			
			String sql1 = "update bank_account set `a_balance` = `a_balance` - 15000 where `a_no`  = ?";
			String sql2 = "update bank_account set `a_balance` = `a_balance` + 15000 where `a_no`  = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);			
			psmt1.setString(1, "101-11-1001");

			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			psmt1.executeUpdate();
			psmt2.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("예기치 못한 오류가 발생하였습니다.");
			}
			
			//sql문을 모두 한번에 실행
			conn.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("update 완료...");
	}
}
