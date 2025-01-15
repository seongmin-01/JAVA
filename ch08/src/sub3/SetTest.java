package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜:2025/01/15
 * 이름:김성민
 * 내용:Java 컬렉션 Set 실습하기
 */
public class SetTest {
	public static void main(String[] args) {
		
		//Set 생성 - 중복데이터는 알아서 삭제됨 순서가 없음
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
		
		//데이터 출력 -> set은 반복자(Iterator)개념으로 출력해야함
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			//다음 데이터가 존재할 때 까지 반복실행
			System.out.println(it.next());
		}
		
		//반복문으로 데이터 출력
		for(int num : set) {
			System.out.println(num);
		}
		
	}
}
