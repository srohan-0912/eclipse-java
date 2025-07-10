package scenarioQuestion;
//Example 1:
//Input: 
//"the sky is blue" 
//Output: 
//"blue is sky the 
//Example 2: 
//Input: 
//"hello world " 
//Output: 
//"world hello" 
//....................IN LC-151.............//
public class reverseWords {
public static void main(String[] args) {
//	String s="the sky is blue";
//	String rev="";
//	s=s.trim();
//	String[] words=s.split(" ");
//	for(int i=words.length-1;i>=0;i--) {
//		rev+=words[i];
//		if(i!=0) {
//			rev+=" ";
//		}
//	}
//	
//	System.out.println(rev);
	
	//USING STRINGBUILDER
	String s="  the sky is blue   ";
	s=s.trim();
	String[] words=s.split("\\s+");
	StringBuilder rev=new StringBuilder();
	for(int i=words.length-1;i>=0;i--) {
		rev.append(words[i]);
		if(i!=0) {
			rev.append(" ");
		}
		
	}
	System.out.println(rev.toString());
}
}
