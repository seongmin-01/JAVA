package ch05.sec06.exam05;

public class Car {
		//필드 선언
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
	
		
		//맨 밑에 만들어 놓은 생성자 사용
		
	Car(String model) {
		this(model,"은색",250);
	}
	
	Car(String model, String color) {
		this(model,color,250);
	}
		
	Car(String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
