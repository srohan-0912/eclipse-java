package comparator;

import java.util.Arrays;

public class penCompaDriver {
public static void main(String[] args) {
	penComparator p1=new penComparator ("afs");
	penComparator p2=new penComparator ("aba");
	penComparator p3=new penComparator ("scs");
	penComparator[] pen={p1,p2,p3};
	for(penComparator p:pen ) {
		System.out.println(p.price);
	}
	
	System.out.println("........");
	
	Arrays.sort(pen);
	for(penComparator p:pen) {
		System.out.println(p.price);
	}
	
	
}
}
