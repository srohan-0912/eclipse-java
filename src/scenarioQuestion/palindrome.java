package scenarioQuestion;

import java.util.Scanner;

//jun-05
//cleaned palindrome
//CHANGE THE UPPERCASE TO LOWERCASE AND REMOVE WHITESPACE COMMA 
//PRINT IF THE REVERSE VALUE IS TRUE IF NOT RETURN FALSE
public class palindrome {
public static void main(String[] args) {
//	String s="ada  ";
   Scanner sc=new Scanner(System.in);
   System.out.println("enter size:");
	 int n=sc.nextInt();
	  sc.nextLine();
	  System.out.println("enter string:");
	  String s=sc.nextLine();
	  check(s);
	 }
public static void check(String s) {
	String temp="";
	s=s.toLowerCase().trim();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			temp+=s.charAt(i);
	 }
	}
	String rev="";
	for(int i=temp.length()-1;i>=0;i--) {
		rev+=temp.charAt(i);
	}
	System.out.println(rev.equals(temp));	
}

}
