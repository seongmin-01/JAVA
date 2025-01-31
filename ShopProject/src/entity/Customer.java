package entity;

public class Customer {
	
	private String custId;
	private String name;
	private String hp;
	private String addr;
	private String rdate;
	
	public Customer() {}
	
	public void showCustomer() {
		System.out.println("--------------------------");
		System.out.println("|아이디|이름|휴대폰번호|주소|가입일|");
		System.out.print(custId + ",");
		System.out.print(name + ",");
		System.out.print(hp + ",");
		System.out.print(addr + ",");
		System.out.print(rdate);
		System.out.println();
	}
	
	public Customer(String custId, String name, String hp, String addr, String rdate) {
		this.custId = custId;
		this.name = name;
		this.hp = hp;
		this.addr = addr;
		this.rdate = rdate;
	}
	
	public Customer(String custId, String name, String hp, String addr) {
		this.custId = custId;
		this.name = name;
		this.hp = hp;
		this.addr = addr;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", hp=" + hp + ", addr=" + addr + ", rdate=" + rdate
				+ "]";
	}
	
	
	
}
