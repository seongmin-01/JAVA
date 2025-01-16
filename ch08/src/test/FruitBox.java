package test;


//Apple과 Banana에서 생성한 것을 일반화 해서 사용하기 위해 정의
public class FruitBox<T> {

	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
