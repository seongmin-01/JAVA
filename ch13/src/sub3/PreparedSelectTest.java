package sub3;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1;

/*
 * 날짜:2025/01/23
 * 이름:김성민
 * 내용:Java CRUD 실습
 */
public class PreparedSelectTest {

	public static void main(String[] args) {
		
		String Host = "jdbc:mysql://localhost:3306/studydb";
		String User = "root";
		String Pass = "1234";
		
		List<User1> users = new ArrayList<>();
		
		try {
			
			//1단계 jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 db연결
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			//3단계 실행객체 생성
			String sql = "select * from `user1`";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
					
			//4단계 실행
			
			//5단계 결과처리
			while(rs.next()) {
				User1 user1 = new User1();
				
				// User1 클래스에 맴버변수 타입을 지정을 해주었기 때문에 별도의 타입을 선언안하고 바로 생성 가능 
				user1.setUid(rs.getString(1)); //get,set을 한번에 처리  
				user1.setName(rs.getString(2));
				user1.setHp(rs.getString(3));
				user1.setAge(rs.getInt(4));
				
				users.add(user1);
			}
			
			//6단계 디비종료
			rs.close();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(User1 user: users) {
			System.out.println(user);
		}
		
		System.out.println("select 완료...");
	}
}
