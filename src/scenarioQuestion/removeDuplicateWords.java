package scenarioQuestion;
import java.util.*;
//ip: 8
//note
//take
//note
//idea
//take
//write
//idea
//plan
//OP:_note take idea write plan    REMOVE THE DUPLICATE AND RETURN THE STRING
public class removeDuplicateWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("the length of the word is:");
	int n=sc.nextInt();
	sc.nextLine();
	Set<String> unique=new LinkedHashSet<>();
	for(int i=0;i<n;i++) {
		String words=sc.nextLine().trim();
		unique.add(words);
		
	}
	for(String res:unique) {
		System.out.print(res+" ");
	}
}
}
