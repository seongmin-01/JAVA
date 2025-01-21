package sub3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 날짜:2025/01/21
 * 이름:김성민
 * 내용:Java 스트림 필터 실습하기
 */
public class StreamFilterTest {
	public static void main(String[] args) {
		
		//리스트 생성
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(nums);
		
		//중복제거
		nums.stream().distinct().forEach(num -> System.out.print(num + ", "));
		System.out.println();
		
		//5이상 데이터 필터링
		nums.stream()
			.filter((num) -> {
				if(num >= 5) {
					return false;
				}
				else {
					return true;
				}
			}).forEach((num)->{
				System.out.print(num + ", ");
			});
		System.out.println();
		//중복제거, 짝수 데이터 필터링, 내림차순 정렬 sorted -> 데이터 정렬 메서드
		nums
		.stream()
		.distinct()
		.filter(num -> num%2 == 0)
		.sorted(Collections.reverseOrder()) //큰거부터 뒤집기(내림차순)
		.forEach(num -> System.out.print(num + ", "));
		
			
		System.out.println();
		
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(number);
		
		number.stream().distinct().forEach(nd -> System.out.print(nd));
		
		System.out.println();
		
		number.stream().filter((nf) -> nf >= 5).forEach(nf -> System.out.print(nf));
	}
}
