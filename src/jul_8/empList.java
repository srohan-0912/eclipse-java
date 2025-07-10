package jul_8;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
public class empList {
public static void main(String[] args) {
	List<employee> l1=new ArrayList();
	 l1.add(new employee("rom", 101, 21, "Developer", 8000));
     l1.add(new employee("san", 102, 42, "Manager", 12000));
     l1.add(new employee("raj", 103, 31, "Tester", 8000));
     l1.add(new employee("ney", 104, 24, "Tester", 45000));
     l1.add(new employee("mbap", 105, 23, "Designer", 500000));
	
//	Predicate<employee> p=(a)->{
//		if(a.sal > 120000) 
//			return true;
//		
//			return false;
//	};
//	List l2=l1.stream().filter(p).toList();
//	System.out.println(l2);
     
     //ADDING 10000 TO SAL
//  Function<employee,employee> e1=(a)->{
//	  a.sal+=10000;
//	  return a;
//  };
//  List l3=l1.stream().map(e1).filter(a-> a.sal>25000).toList();
//  System.out.println(l3);
  
     
     l1.stream().distinct().forEach(System.out::println);
     
     
}
}
