package jul_8;

import java.util.*;
import java.util.stream.Stream;

public class findSecLarUsingStream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(12);
		list.add(40);

		List<Integer> l1 = list.stream().distinct().sorted((a, b) -> b - a).toList();
		System.out.println(l1);
		if(l1.size() >= 2) {
			System.out.println(l1.get(1));
		}
		
	}
}
