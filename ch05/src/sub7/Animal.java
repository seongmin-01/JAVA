package sub7;

// abstract 추상 클래스나 메서드를 정의하기 위한 키워드

//추상클래스 - 추상 메서드를 갖는 클래스, 상속을 위한 클래스
public abstract class Animal {
	
	//추상메서드 - 내용이 없는 미완성 메서드,오버라이드를 위한 메서드
	public abstract void move(); 
	
	public void hunt() {}
}
