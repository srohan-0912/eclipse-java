package jul_8;
import java.util.*;
//USING STREAM
public class list1 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add(11);
	list.add(12);
	list.add(12);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);	
	
//	 TO PRINT UNIQUE ELEMENT IN LIST
//	System.out.println(list.stream().distinct().toString()); 
	
	
	     //PRINT UNIQUE AND EVEN NUMBER
//	List<Integer> li = list.stream().distinct().filter(a -> a % 2 == 0).toList();
//	
//   System.out.println(li);
	
      //TO PRINT SQUARE VALUE
//	List li=list.stream().map(a-> a*a).distinct().toList();  
//	System.out.println(li);
	
	//get max element 
//	Integer li=list.stream().max((a,b)->a-b).get();
//	System.out.println(li);
	
	//FOR SORTING  IN ASCEN
//	List l=list.stream().sorted((a,b)->a-b).toList();
//	System.out.println(l);
	
	//FOR SORTING USING DESCEN
//	List li=list.stream().sorted((a,b)->b-a).toList();
//	System.out.println(li);
	
	List li=list.stream().limit(3).toList();
	System.out.println(li);
		   
}
}
