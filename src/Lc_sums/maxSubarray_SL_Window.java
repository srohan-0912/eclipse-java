package Lc_sums;
//MAX SUBARRAY SLIDING WINDOW
public class maxSubarray_SL_Window {
public static void main(String[] args) {
	int[] arr= {2,1,5,1,2,3};
	int k=3;
	
	int max=0;
	int sum=0;
	for(int i=0;i<k;i++) {
	  sum+=arr[i];	
	}
	max=sum;
	for(int i=k;i<arr.length;i++) {
		sum+=arr[i]-arr[i-k];
		max=Math.max(max,sum);
		
	}
	System.out.println(max);;	
}
}
