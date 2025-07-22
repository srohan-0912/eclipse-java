package programs_16Jul;
import java.util.*;
//The first line will have an integer denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
//After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
//Constraints:
//A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
//For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.
//To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.
//Example:
//Input:
//3
//uncle sam
//99912222
//tom
//11122222
//harry
//12299933
//uncle sam
//uncle tom
//harry
//Output:
//uricle sam 99912222
//not found


public class bookEntryStr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	Map<String,Integer> map=new HashMap<>();
	for(int i=0;i<size;i++) {
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the phno:");
		int ph=sc.nextInt();
		map.put(name, ph);
	}

	System.out.println("enter the query:");
		String query=sc.next();
		
		if(map.containsKey(query)) {
			System.out.println(query+"="+map.get(query));
			
		}
		else {
			System.out.println("not found");
			
		}
}
}
