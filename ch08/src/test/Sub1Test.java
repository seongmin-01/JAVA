package test;

//복습용
public class Sub1Test {

	public static void main(String[] args) {
	
		//mango 객체 생성
		Mango mango = new Mango("한국",3000);
		
		//FruitBox타입으로 생성한 mangobox라는 객체에 들어갈 값에 대한 타입을 치환변수로 지정
		FruitBox<Mango> mangobox = new FruitBox<>();
		
		//제너릭으로 정의한 클래스의 setter호출하여 값을 위의 mango객체로 설정
		mangobox.setFruit(mango);
		
		//getter로 출력
		System.out.println(mangobox.getFruit());
	}
	
}
