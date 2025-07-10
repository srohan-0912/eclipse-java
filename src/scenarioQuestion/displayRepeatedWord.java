package scenarioQuestion;
//ip->enter the length:  
//4
//hello
//fjj
//hello
//fjj
//OP->fjj hello

import java.util.*;
public class displayRepeatedWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size:");
	int n=sc.nextInt();
	sc.nextLine();
	System.out.println("enter string:");
    String[] words=new String[n];
    for(int i=0;i<n;i++) {
    	words[i]=sc.nextLine().trim();
    }
    check(words);
}
public static void check(String[] words) {
	Set<String> seen=new HashSet<>();
	Set<String> rep=new HashSet<>();
	for(String word:words) {
		if(!seen.add(word)) {
			rep.add(word);
		}
	}
	System.out.println(String.join(" ",rep));
 }
}
