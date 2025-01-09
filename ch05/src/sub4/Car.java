package sub4;
/*
 * 날짜:2025/01/07
 * 이름:김성민
 * 내용:Java 클래스 실습하기
 */

//Car 클래스 정의(설계)
public class Car {
	
	//protected 접근권한으로 자식클래스에서 참조 가능
	protected String name;
	protected String color;
	protected int speed;
	
	//속성(맴버 변수)  - class 속성은 private 선언(배우는 단계이기 때문) - 캡슐화를 위해
	//private String name;
	//private String color;
	//private int speed;
	
	//생성자 - 캡슐화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환타입이 없는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	//기능(맴버 메서드) - 클래스 메서드는 public선언 (호출해서 사용해야 효율적이므로)
	public void speedUp(int speed) {
		//this는 현재 클래스를 지칭
		this.speed += speed;
	}
	
    public void speedDown(int speed) {
		this.speed -= speed;
	}
    
    public void show() {
    	System.out.println("차량명: " +this.name);
    	System.out.println("차량색: " +this.color);
    	System.out.println("현재속도: " +this.speed);
    }

    
    
  //Getter Setter 정의(옵션-필요에 따라 하면됨.) - 캡슐화된 속성을 수정하기 위한 메서드
    public String getColor() {
		return color;
	}
    
    public void setColor(String color) {
		this.color = color;
	}
    
}



