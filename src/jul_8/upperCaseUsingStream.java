package jul_8;
import java.util.*;
import java.util.stream.*;
public class upperCaseUsingStream {
public static void main(String[] args) {
	List<String> l1=Arrays.asList("aba","dff","jdg");
	List<String> l2=Arrays.asList("AAba","KJDf","jDg");
	//CHANGE L1 TO UPPERCASE
	List<String> l3=l1.stream().map(String::toUpperCase).toList();
	System.out.println("the uppercase element are:"+l3);
	
	//CHANGE L2 TO LOWERCASE
//	List<String> l4=l2.stream().map(String::toLowerCase).toList();
//	System.out.println("Lower case are:"+l4);
	
	l2.stream().map(String::toLowerCase).forEach(System.out::println);
}
}
 