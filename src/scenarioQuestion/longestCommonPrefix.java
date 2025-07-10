package scenarioQuestion;
//IP:-enter the length:
//3
//flower
//flag
//flight
//OP:-fl
//...................LC-14..............
import java.util.*;
public class longestCommonPrefix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length:");
	int n=sc.nextInt();
	sc.nextLine();
	String[] words=new String[n];
	for(int i=0;i<n;i++) {
		words[i]=sc.nextLine().trim();
	}
	Arrays.sort(words);
	String s1=words[0];
	String s2=words[words.length-1];
	int i=0;
	while(i<s1.length() &&i < s2.length()) {
		if(s1.charAt(i) ==s2.charAt(i)) {
			i++;
		}
		else {
			break;
		}
	}
	System.out.println(s1.substring(0,i));
		
	
}
}
