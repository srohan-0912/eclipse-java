package prog_jul_24;

//1. Move All Special Characters to End of String
//Scenario (real-world, product style):
//You're building a search engine for a large e-commerce platform.
//For consistent indexing, product titles must keep letters & numbers in order, but all special characters (like #, %, $) should be pushed to the end (keeping their order).
//This ensures search ranking ignores noisy characters.
//Function Signature:
//String reorder(String s)
//Examples:
//Input"a#b$c%"
//"abc#$%"
//"@Hello12300
//Output
//"Hello12300@"
//"Shop I@Now"
//"ShopNow!@"

public class moveSpeCharEndOfString {
public static void main(String[] args) {
	String s="a#v$c%a";
	StringBuilder sb=new StringBuilder();
	StringBuilder sc=new StringBuilder();
	for(char c:s.toCharArray()) {
		if(c >='a' && c<='z') {
			sb.append(c);
		}
		else {
			sc.append(c);
		}
	}
	sb.append(sc);
	System.out.println(sb.toString());
	
}
}
