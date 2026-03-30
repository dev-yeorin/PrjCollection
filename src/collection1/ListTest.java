package collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// 배열 -> ArrayList로 변경하는 법
		String [] names 	  = {"홍길동", "이길동", "박길동", "최길동"};
		List<String> nameList = Arrays.asList(names);
		System.out.println(nameList);
		
		// nameList.add("나길동"); //java.lang.UnsupportedOperationException
		//Arrays.asList() 변환 리스트는 add 불가, 사이즈 변경 불가
		for (int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			System.out.println(name + " ");
				}
		System.out.println();
		
		// Sort
		// ArrayList 오름차순 정렬
		//Collections.sort( nameList ); assending sort
		Collections.sort( nameList );
		System.out.println( nameList );
		
		// 오름차순 ArrayList 뒤집기
		// descending sort
		Collections.reverse(nameList);
		System.out.println(nameList);
		
		System.out.println("==========================");
		// 람다식: (a, b) -> a.compareTo(b)
		// boolean func(String a, String b) {
		// 		return a.compareTo(b);
		// }
		
		// 오름차순 정렬
		Collections.sort(nameList, (a,b) -> a.compareTo(b));
		System.out.println(nameList);
		// 내름차순 정렬
		Collections.sort(nameList, (a,b) -> b.compareTo(a));
		System.out.println(nameList);
		
	}

}
