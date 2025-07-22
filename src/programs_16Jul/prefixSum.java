package programs_16Jul;
import java.util.*;
public class prefixSum {
public static void main(String[] args) {
	int[] arr= {2,5,3,2,7,5};
	int k=18;
	int prefix=0;

    ArrayList<Integer> list=new ArrayList<>();
    list.add(prefix);
	for(int num:arr) {
		prefix+=num;
		if(list.contains(prefix-k)) {
			System.out.println("present");
			return;
		}
		list.add(prefix);
	}
	System.out.println("not present");
}
}
