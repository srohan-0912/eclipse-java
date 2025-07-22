package programs_16Jul;

public class maxSubarray {
public static void main(String[] args) {
	int[] arr= {1,24,5,-5,4,3,-1,-6,3,2};
	int sum=0;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		max=Math.max(max, sum);
		if(sum<0) {
			sum=0;
		}
	}
	System.out.println(max);
}
}
