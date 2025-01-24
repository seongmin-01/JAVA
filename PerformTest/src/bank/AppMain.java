package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void createAccount() {
		System.out.println("------------------계좌생성---------------------");
		
		 System.out.print("계좌번호: ");
		 String ano = scanner.nextLine();
		    
		 System.out.print("예금주: ");
		 String owner = scanner.nextLine();
		    
		 System.out.print("초기 입금액: ");
		 int balance = Integer.parseInt(scanner.nextLine());

		 Account newAccount = new Account(ano, owner, balance);
		 accounts.add(newAccount);
		 System.out.println("결과: 계좌가 생성되었습니다.");
		   
	};
	

	public static void accountList() {
		
		for(Account ac : accounts) {
			System.out.println(ac.getAno() + " " + ac.getOwner() + " " + ac.getBalance());
		}
		
	};
	
	public static void deposit() {
		System.out.println("------------------예금---------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		int inbalance = Integer.parseInt(scanner.nextLine());
		   
		 // 계좌 찾기
	     Account account = findAccount(ano);
		  
		 account.setBalance(account.getBalance() + inbalance);
	     
		 System.out.print("결과:예금이 성공되었습니다. ");
		 
	};
	
	public static void withdraw() {
		System.out.println("------------------출금---------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("출금액: ");
		int inbalance = Integer.parseInt(scanner.nextLine());
		   
		 // 계좌 찾기
	     Account account = findAccount(ano);
		  
		 account.setBalance(account.getBalance() - inbalance);
	     
		 System.out.print("결과:출금이 성공되었습니다. ");
	};
	
	public static Account findAccount(String ano) {
		for (Account account : accounts) {
	        // 계좌번호가 일치하는 계좌 찾기
	        if (account.getAno().equals(ano)) {
	            return account;  // 일치하는 계좌 반환
	        }
	    }
	    return null;  // 계좌를 찾지 못한 경우 null 반환
	};
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		
		while(isRunning) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				isRunning = false;
			}
		}
		
		System.out.println("프로그램 종료");
	
	}
}
