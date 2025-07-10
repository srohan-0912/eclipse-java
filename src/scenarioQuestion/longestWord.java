package scenarioQuestion;
import java.util.*;
//jun-04
//i/p--->i absolutely love a programming language
//o/p-->programming

public class longestWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("the string is");
	String s=sc.nextLine();
	length(s);
}
	public static void length(String s) {
	String ans="";
	int max=0;
	for(String str:s.split(" +")) {
		if(max < str.length()) {
			max=str.length();
			ans=str;
		}
    }
	System.out.println(ans);
	
}
}
