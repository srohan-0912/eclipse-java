package programs_16Jul;

import java.util.ArrayList;
import java.util.Collections;


public class leadersInArrays {
public static void main(String[] args) {
	int[] arr= {14,2,4,6,8,6};
	ArrayList<Integer> list=new ArrayList<>();
	int max=arr[arr.length-1];
	list.add(max);
	for(int i=arr.length-2;i>=0;i--) {
		if(arr[i] >=max) {
			max=arr[i];
			list.add(max);
			
		}
	}
	Collections.reverse(list);
	System.out.println(list);;
}
}
