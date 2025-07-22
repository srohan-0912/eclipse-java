package programs_16Jul;
//You are given an ArrayList<String> that may contain duplicate elements. Your task is to write a Java method named removeDuplicates that processes this list and returns a new ArrayList<String> which contains only the unique elements-keeping the first occurrence of each element and removing subsequent duplicates.
//You must not modify the original list. The new list should maintain the same order in which the unique elements appeared in the original list.
//Example 1:
//Input: ["a", "b", "a", "c", "b"]
//Output: ["a", "b", "c"]
//Example 2:
//Input: ["java", "java", "java", "java"]
//Output: ["java"]
import java.util.*;
public class removeDuplicateUsingList {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the string:");
	
	String[] s=new String[size];
	for(int i=0;i<size;i++) {
		s[i]=sc.next();
	}
	//AAPROACH USIING STREAM
//	List l1=Arrays.stream(s).distinct().toList();
//	System.out.println(l1);
//	
//	APPROACH 2: using list
	ArrayList<String> unique=new ArrayList<>();
	for(String str:s) {
		if(!unique.contains(str)) {
			unique.add(str);
		}
	}
	System.out.println(unique);
}
}
