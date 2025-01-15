package sub1;
/*
 * 날짜:2025/01/15
 * 이름:김성민
 * 내용:Java Generic 클래스 실습하기
 */
public abstract class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국",2000);
		Banana banana = new Banana("일본",3000);
		
		
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.setFruit(apple);
		System.out.println(box1.getFruit());
		
		FruitBox<Banana> box2 = new FruitBox<Banana>();
		box2.setFruit(banana);
		System.out.println(box2.getFruit());
		
	}
}
