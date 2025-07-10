package Lc_sums;
//LC-290
import java.util.*;
public class wordPattern {
public static void main(String[] args) {
	String s = "dog cat cat dog";
	String pattern="abba";
	String[] words=s.split(" ");
	if(pattern.length() != words.length) {
		 System.out.println(false);
		 return;
	}
	Map<Character,String> map=new HashMap<>();
	Set<String> set=new HashSet<>();
	for(int i=0;i<pattern.length();i++) {
		char c=pattern.charAt(i);
		String word=words[i];
		if(map.containsKey(c)) {
			if(!map.get(c).equals(word)) {
				System.out.println("false");
				return;
			}
		}
			else if(set.contains(word)) {
				System.out.println("false");
				return;
			}
			map.put(c,word);
			set.add(word);
		}
	System.out.println("true");
}
}
