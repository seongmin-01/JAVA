package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜:2025/01/23
 * 이름:김성민
 * 내용:Java CRUD 실습
 */

public class SelectTest {
	public static void main(String[] args) {
		
		final String Host = "jdbc:mysql://localhost:3306/studydb";
		final String User = "root";
		final String Pass = "1234";
		
		//결과셋 저장 리스트 생성
		List<User1> users = new ArrayList<>();
		
		try {
			//1단계 - jdbc 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - db 접속
			Connection conn = DriverManager.getConnection(Host,User,Pass);
			
			//3단계 - sql 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계 - sql 실행
			String sql = "Select * from `user1`";
			ResultSet rs = stmt.executeQuery(sql); //select문은 executeQuery로 실행
			
			//5단계 - 실행결과 처리 (조회) 
			while(rs.next()) { //db의 값을 커서로 내려가면서 해당 레코드(행)을 가르킴 -> 해당 행의 데이터를 하나씩 뽑아내는거임
				//ResultSet 커서를 데이터 갯수 만큼 next() 시켜 각 컬럼별 데이터 추출
				
				String uid = rs.getString(1); //데이터 읽기
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				// 추출된 데이터를 가지고 User1 엔티티 객체 생성 및 초기화
				User1 user1 = new User1();
				user1.setUid(uid);  // 위에서 읽은 데이터를 user1객체에 설정
				user1.setName(name);
				user1.setHp(hp);
				user1.setAge(age);
				
				//User1 엔티티 객체 리스트 저장
				users.add(user1);
			}			
			
			//6단계
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User1 user: users) {
			System.out.println(user);
		}
		
		System.out.println("Select 완료...");
	}
}
