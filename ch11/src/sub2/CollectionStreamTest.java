package sub2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 날짜:2025/01/21
 * 이름:김성민
 * 내용:Java 컬렉션 스트림 실습하기
 */

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class CollectionStreamTest {
	public static void main(String[] args) {
		
		List<String> people = new ArrayList<>();
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		//외부반복자를 이용한 출력 
		for(String p : people) {
			System.out.println(p);
		}
		
		//이게 원조임 자바가 버전업 되면서 위의 for문방식도 지원
		Iterator<String> it = people.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//내부반복자를 이용한 출력 forEach() -> for문이랑 같은 기능이지만 내부에서 반복을 돌림
		people.stream().forEach((p)->{ //forEach 메서드(함수)에 또 람다식으로 함수가 들어감.
			System.out.println(p);
		});  
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신",23));
		persons.add(new Person("김춘추",21));
		persons.add(new Person("장보고",33));
		persons.add(new Person("강감찬",43));
		persons.add(new Person("이순신",53));
		
		//외부 반복자
		for(Person p: persons) {
			System.out.println(p);
		}
		
		//내부 반복자
		persons.stream().forEach(System.out::println);
		
	}
}
