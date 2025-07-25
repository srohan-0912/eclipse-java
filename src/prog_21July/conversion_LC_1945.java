package prog_21July;

public class conversion_LC_1945 {
public static void main(String[] args) {
//	String s="zbax";
//	String s="iiii";
	String s="leetcode";
	int k=2;
	StringBuilder sb=new StringBuilder();
	for(char c:s.toCharArray()) {
		sb.append(c-'a'+1);
	}
	String str=sb.toString();
	while(k>0) {
		int sum=0;
		for(char a:str.toCharArray()) {
			sum+=a-'0';
			k--;
		}
		str=Integer.toString(sum);
	}
	System.out.println(Integer.parseInt(str));
	
}
}
