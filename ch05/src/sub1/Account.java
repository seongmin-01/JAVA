package sub1;

//Account 클래스 정의(설계)
public class Account {

	//속성(필드,맴버변수라고 불림) 
	String bank;
	String id;
	String name; 
	int balance; 
	
	//기능
	public void deposit(int money) {    //입금
		this.balance += money;
	}
	
	public void withdraw(int money) {   //출금
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("----------------------");
		System.out.println("은행명: " + this.bank);
		System.out.println("계좌번호: " + this.id);
		System.out.println("입금주: " + this.name);
		System.out.println("현재 잔액: " + this.balance);
		System.out.println("----------------------");
		
	}
}
