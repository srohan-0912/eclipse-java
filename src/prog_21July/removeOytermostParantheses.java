package prog_21July;
//lc->1021
public class removeOytermostParantheses {
public static void main(String[] args) {
	String s="(()())(())";
	int cnt=0;
	StringBuilder sb=new StringBuilder();
	for(char c:s.toCharArray()) {
		if(c == '(') {
			if(cnt>0) {
				sb.append(c);
			}
			cnt++;
		}
		else if(c == ')') {
			cnt--;
			if(cnt>0) {
				sb.append(c);
			}
		}
		
	}
	System.out.println(sb.toString());
}
}
