package arrayList;

import java.util.*;

public class Al_24jun {
public static void main(String[] args) {
	List l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(50);
	l1.add(60);
	Iterator i=l1.iterator();
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
		
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
}
}
