package sub3;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("서울");
		list.add("대전");
		list.add("대구");
		list.add("부산");
		list.add("광주");
		
		System.out.println(list);
		
		//링크 추가
		
		list.add(1, "수원");
		list.addFirst("인천");
		list.addLast("울산");
		System.out.println(list);
	}
}
