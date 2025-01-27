package user2;

import java.util.List;
import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		
		 System.out.println("------------------------");
	     System.out.println("User2 CRUD 실습");
	     System.out.println("------------------------");
	
	     Scanner sc = new Scanner(System.in);
	     boolean isRunning = true;
	     
	     User2Dao dao = User2Dao.getInstance();
	     
	     while(isRunning) {
	    	 System.out.println("0 : 종료 | 1 : 입력 | 2 : 조회 | 3 : 검색 | 4 : 수정 | 5 : 삭제");
	         System.out.print("선택> ");
	         
	         int answer = sc.nextInt();
	         
	        switch (answer) {
			case 0: 
				isRunning = false;
				break;
			case 1: 
				User2 user = inputUser(sc);
				dao.insertUser2(user);
				System.out.println("insert 완료...");
				break;
				
			case 2: 
				List<User2> user2List = dao.selectUser2List();
				for(User2 user2 : user2List) {
					System.out.println(user2);
				}
				break;
				
			case 3: 
				String uid = findUser(sc);
				User2 user2 = dao.selectUser2(uid);
				
				if(user2 != null) {
					System.out.println(user2);
				}
				else {
					System.out.println("해당 아이디를 찾을 수 없습니다.");
				}
				break;
				
			case 4: 
				User2 modifyuser = modfiyUser(sc);
				dao.updateUser2(modifyuser);
				System.out.println("해당 사용자를 수정했습니다.");
				break;
				
			case 5: 
				String removeUid = removeUser(sc);
				dao.deleteUser2(removeUid);
				System.out.println("해당 사용자를 삭제 하였습니다.");
				break;
				
			}
	         
	     }
	     System.out.println("프로그램 종료...");
	}
	public static User2 inputUser(Scanner sc) {
		sc.nextLine();
		
		System.out.println("아이디 입력: ");
		String uid = sc.nextLine();
		
		System.out.println("이름 입력: ");
		String name = sc.nextLine();

	
		System.out.println("생년월일 입력: ");
		String birth = sc.nextLine();
		
		System.out.println("주소 입력: ");
		String addr = sc.nextLine();
		
		User2 user = new User2(uid, name, birth, addr);
		System.out.println(user);
		
		return user;
	}
	
	public static String findUser(Scanner sc) {
		sc.nextLine();
		
		System.out.println("검색 아이디 입력:");
		String uid = sc.nextLine();
		
		return uid;
	}
	
	public static User2 modfiyUser(Scanner sc) {
		sc.nextLine();
		
		System.out.println("수정 아이디 입력: ");
		String uid = sc.nextLine();
		
		System.out.println("수정 이름 입력: ");
		String name = sc.nextLine();
		
		System.out.println("수정 생년월일 입력: ");
		String birth = sc.nextLine();
		
		System.out.println("수정 주소 입력: ");
		String addr = sc.nextLine();
		
		
		User2 user = new User2(uid, name, birth, addr);
		System.out.println(user);
		return user;
	}
	
	public static String removeUser(Scanner sc) {
		sc.nextLine();
		
		System.out.println("삭제할 아이디 입력:");
		String uid = sc.nextLine();
		
		return uid;
	}
}
