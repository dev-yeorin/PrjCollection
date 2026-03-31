package collection4;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	// Queue 는 Java 에 class 없음 -> LinkedList 를 사용하여 Queue 를 흉내냄
	public static void main(String[] args) {
		// Java 에서 Queue 는 Interface 다
		Queue<String> queue  = new LinkedList<>();
		queue.add("일");
		queue.add("월");
		queue.add("화");
		queue.add("수");
		queue.add("목");
		queue.add("금");
		queue.add("토");
		
		// poll()
		System.out.println(queue.poll() + queue.size());
		System.out.println(queue.poll() + queue.size());
		System.out.println(queue.poll() + queue.size());
		System.out.println(queue.poll() + queue.size());
		System.out.println(queue.poll() + queue.size());
		System.out.println(queue.poll() + queue.size());
		System.out.println(queue.poll() + queue.size());

	}

}
