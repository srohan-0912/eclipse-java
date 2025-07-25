package prog_21July;
//s will contain at least one letter that appears twice.
//Example 1:
//Input:s="abccbaacz"
//Output: "c"
//E xplanation:
//The letter 'a' appears on the indexes 0, 5 and 6.
//The letter 'b' appears on the indexes 1 and 4.
//The letter 'c' appears on the indexes 2, 3 and 7.
//The letter 'z' appears on the index 8.
//The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
//Example 2:
//Input:
//s = "abcdd"
//Output: "d"
//Explanation:
//1
//The only letter that annears twice is 'd' so we return 'd'..
import java.util.*;
public class printFrstOccurenceInString {
public static void main(String[] args) {
//	String s="abccbaacz";
	String s="abcdd";
	HashSet<Character> set=new HashSet<>();
	for(char c:s.toCharArray()) {
		if(!set.contains(c)) {
			set.add(c);
		}
		else {
			System.out.println(c);
			break;
		}
	}
}
}
