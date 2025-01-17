package Test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜:2025/01/17
 * 이름:김성민
 * 내용:로또번호 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();	
		
		//for문인데 초기,조건,증감식이 없음 -> 무한반복이란 소리임
		for(;;) {
			
			//ceil() -> 실수값을 올림함
			int num = (int)Math.ceil(Math.random()*45);  //random은 실수형값으로 받아오기 때문에 정수형으로 다시 형변환 해줌
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;  //for문이 무한반복이기 때문에 break 걸어줌
			}
		}
		
		//정렬을 위해 TreeSet 사용  -> 순서없이 저장되는 Set의 특징때문에 노드화해서 재정렬해주기 위해서 사용함
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
		
	}
}
