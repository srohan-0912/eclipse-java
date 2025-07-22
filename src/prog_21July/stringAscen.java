package prog_21July;
//EG: s=abc##xyz
//OP=> ##abcxyz
public class stringAscen {
public static void main(String[] args) {
	String s="abc##xyz";
     StringBuilder sb=new StringBuilder();
     StringBuilder hash=new StringBuilder();
	for(char c:s.toCharArray()) {
		if(c >= 'a' && c <= 'z') {
			sb.append(c);
		}
		else if(c == '#'){
			hash.append(c);
		}
	}
    System.out.println(hash.append(sb).toString());
}
}
