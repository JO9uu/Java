package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {
	public static void main(String[] args) {
	
		//컬렉션 기본 타입을 취급 안함
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) {
			
			System.out.print(stack.pop() + "  ");
			
		}
		System.out.println();
		//큐
		
		Queue<String> queue = new LinkedList<>();
				
		queue.offer("서울");
		queue.offer("대전");
		queue.offer("대구");
		queue.offer("부산");
		queue.offer("광주");
		
		while(!queue.isEmpty()) {
			
			System.out.print(queue.poll() + " ");
		}
    }
}
