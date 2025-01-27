package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User2Dao {
	
	private static User2Dao instance = new User2Dao();
	public static User2Dao getInstance() {
		return instance;
	}
	private User2Dao() {}
	
	private final String Host = "jdbc:mysql://localhost:3306/studydb";
	private final String User = "root";
	private final String Pass = "1234";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(Host,User,Pass);
	}
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public void insertUser2(User2 user) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.insert_user2);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getAddr());
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public User2 selectUser2(String uid) {
		User2 user = null;
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.update_user2);
			psmt.setString(1, uid);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				user = new User2();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User2> selectUser2List() {
		List<User2> list = new ArrayList<>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.select_user2list);
			
			while(rs.next()) {
				User2 user = new User2();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
				list.add(user);
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void updateUser2(User2 user) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.update_user2);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getBirth());
			psmt.setString(3, user.getAddr());
			psmt.setString(4, user.getUid());
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser2(String uid) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.delete_user2);
			psmt.setString(1, uid);
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
		public void closeAll() throws SQLException {
			
			if(rs != null) {
				rs.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
	}
}
