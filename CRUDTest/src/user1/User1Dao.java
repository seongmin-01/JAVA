package user1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 *  DAO 클래스
 *  - Data Access Object
 *  - 데이터베이스 테이블 CRUD 처리 객체
 */
public class User1Dao {
	
	//싱클톤
	private  static User1Dao instance = new User1Dao();
	public static User1Dao getInstance() {
		return instance;
	}
	private User1Dao() {}
	
	//DB정보
	private final String Host = "jdbc:mysql://localhost:3306/studydb";
	private final String User = "root";
	private final String Pass = "1234";
	
	//커넥션
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(Host,User,Pass);
	}
	
	//리소스
	private Connection conn = null;
	private Statement  stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	//기본 CRUD 메서드
	public void insertUser1(User1 user) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.insert_user1);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getHp());
			psmt.setInt(4, user.getAge());
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public User1 selectUser1(String uid) {
		User1 user = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.select_user1);
			psmt.setString(1, uid);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				user = new User1();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getInt(4));
			}
			
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User1> selectUser1List() {
		List<User1> list = new ArrayList<>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.select_user1list);
			
			while(rs.next()) {
				User1 user = new User1();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setHp(rs.getString(3));
				user.setAge(rs.getInt(4));
				list.add(user);
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void updateUser1(User1 user) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.update_user1);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getHp());
			psmt.setInt(3, user.getAge());
			psmt.setString(4, user.getUid());
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser1(String uid) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.delete_user1);
			psmt.setString(1, uid);
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	//통합 close(자원해제) 메서드
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
