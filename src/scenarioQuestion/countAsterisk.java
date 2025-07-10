package scenarioQuestion;
////jun-05 qno-10
//IP->the strings are:
//####*
// OP->3 * should be added
import java.util.*;
public class countAsterisk {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("the strings are:");
	String s=sc.nextLine();
	int acnt=0;
	int hcnt=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='*') {
			acnt++;
		}
		else if(s.charAt(i)=='#') {
			hcnt++;
		}
	}
	if(acnt == hcnt) {
		System.out.println("balanced");
		return;
	}
	if(acnt > hcnt) {
		System.out.println((acnt-hcnt)+ " # should be added");
	}
	else {
		System.out.println((hcnt-acnt)+" * should be added");
	}
	
}
}
