package prog_21July;
//compress String:     LC->443
//s=aabbbcc
//op:->a2b3c2
public class compressString {
public static void main(String[] args) {
	String s="aabbcccd";
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
	System.out.println("hi: "+sb.toString());
	
}
}
