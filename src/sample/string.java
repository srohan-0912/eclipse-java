package sample;
import java.util.*;
public class string {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter size:");
 int n=sc.nextInt(); 
 sc.nextLine();
 System.out.println("enter the string:");
 String[] words =new String[n];
 for(int i=0;i<n;i++) {
	 words[i]=sc.nextLine();
 }
 check(words);
}
public static void check(String[] words) {
  Arrays.sort(words);
 String s1=words[0];
  String s2=words[words.length-1];
  int i=0;
  while(i<s1.charAt(i) && i<s2.charAt(i)) {
	  if(s1.charAt(i) == s2.charAt(i)) {
		  i++;
		  
	  }
	  else {
		  break;
	  }
  }
System.out.println(s1.substring(0,i));
}
}