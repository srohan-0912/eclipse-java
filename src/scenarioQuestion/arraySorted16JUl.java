package scenarioQuestion;
//check if the array is sorted or not 16 JUL qnes in qsp 
import java.util.*;
public class arraySorted16JUl {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int  size=sc.nextInt();
//	int[] arr=new int[size];
//	for(int i=0;i<size;i++) {
//		arr[i]=sc.nextInt();
//		
//	}
	int[] arr= {1,2,3,4,5};
	
	System.out.println(sort(arr));
}
	public static boolean sort(int[] arr) {	
		boolean sorted=true;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			sorted=false;
			break;
		}
	}
	return sorted;
}
}
