package collection2;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		// 중복되지 않는 문자 배열
		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("Html");
		set.add("Oracle");
		set.add("Java");
		set.add("Spring");
		System.out.println(set.size()); // 4
		System.out.println(set);

		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name + " ");
			
		}
		System.out.println();
			
	}

}
