package Lc_sums;
import java.util.*;
//ZOHO 
public class countCOnsecChara {
public static void main(String[] args) {
	String s= "aaabbcdd";
	StringBuilder sb=new StringBuilder();
	int cnt=1;
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i) == s.charAt(i+1)) {
			cnt++;
		}
		else {
			sb.append(s.charAt(i));
			if(cnt>1) {
				sb.append(cnt);
			}
			cnt=1;
		}
	}
	sb.append(s.charAt(s.length()-1));
	if(cnt>1) {
		sb.append(cnt);
	}
	System.out.println(sb.toString());
}
}
