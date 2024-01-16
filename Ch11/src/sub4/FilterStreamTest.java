package sub4;
/*
 * 날짜: 2024/01/16
 * 이름: 정원구
 * 내용: Java 컬렉션 스트림 필터 실습하기
 */

import java.util.Collections;
import java.util.List;

public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(numbers);
		
		//중복제거
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", "));
		
		System.out.println();
		
		//5 이상 데이터만 필터링
		numbers.stream()
				.filter(num->num >=5)
				.forEach(num -> System.out.print(num + ", "));		
		
		System.out.println();
		
		//중복 제거하고 짝수 데이터, 내림차수로 필터링
		numbers.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.filter(num -> num % 2 == 0)
				.forEach(num -> System.out.print(num + ", "));
		
		
		
		
	}
}
