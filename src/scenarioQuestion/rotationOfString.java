package scenarioQuestion;
import java.util.*;
//jun-05
public class rotationOfString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("the string 1 is:");
	String s1=sc.nextLine();
	System.out.println("the string 2 is:");
	String s2=sc.nextLine();
	
	if(s1.length() != s2.length()) {
		System.out.println(false);
		return;
	}
	String combine=s1+s1;
	if(combine.contains(s2)) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
}
}
