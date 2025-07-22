package programs_16Jul;
/////////
//LC->1047
/////////
import java.util.Stack;

public class removeAdjDuplicateString {
public static void main(String[] args) {
	String s= "abbaca";
	Stack<Character> st=new Stack<>();
	for(char c:s.toCharArray()) {
		if(!st.empty() && st.peek() == c) {
			st.pop();
		}
		else {
			st.push(c);
		}
	}
	StringBuilder sb=new StringBuilder();
	for(char c:st) {
		sb.append(c);
	}
	System.out.println(sb.toString());
}
}
