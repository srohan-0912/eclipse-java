package programs_16Jul;
//lc-179
import java.util.Arrays;

public class largestNumberLc_179 {
public static void main(String[] args) {
	int[] nums= {2,30,34,5,9};
	
	String[] str=new String[nums.length];
	for(int i=0;i<nums.length;i++) {
		str[i]=String.valueOf(nums[i]);
	}
	Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
	StringBuilder sb=new StringBuilder();
	for(String s:str) {
		sb.append(s);
	}

	System.out.println(sb.toString());
	
}
}
