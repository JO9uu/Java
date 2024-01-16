package sub3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜: 2024/01/16
 * 이름: 정원구
 * 내용: 자바 컬렉션 스트림 실습하기
 * 
 */

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge() {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class StreamTest {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList();
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		
		//외부 반복자를 이용한 출력
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		//내부 반복자를 이용한 출력
		Stream<String> stream = names.stream();
		stream.forEach( (name) -> {
			System.out.println(name);
		} );

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 23));
		persons.add(new Person("김춘추", 25));
		persons.add(new Person("장보고", 27));
		persons.add(new Person("강감찬", 29));
		persons.add(new Person("이순신", 31));
		
		//외부 반복자 처리
		for(Person person : persons) {
			System.out.println("이름: " + person.getName() + ", 나이: " + person.getAge());
		}
		//내부 반복자 처리
		Stream<Person> pStream = persons.stream();
		pStream.forEach(null);
		
		
		
		
	}
}
