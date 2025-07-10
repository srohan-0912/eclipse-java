package scenarioQuestion;

import java.util.Scanner;

//return true if all the string in the form of digit
//else false if there is non digit character
public class validatingOTP {
public static void main(String[] args) {
//	 String s="1 234";
	 Scanner sc=new Scanner(System.in);
	 System.out.println("size:");
	 int size=sc.nextInt();
	 
	 sc.nextLine();
	 System.out.println("string:");
	 String s=sc.nextLine();
	 
		check(s);
	}
	public static void check(String s) {
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >='0' && s.charAt(i) <='9') {
				cnt++;
			}
		}
			if(cnt == s.length()){
				System.out.println(true);
			}
			else{
				System.out.println("false");
			}
		
	}
	}
