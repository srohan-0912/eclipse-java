package programs_16Jul;
//DUTCH NATIONAL ALGORITHM

import java.util.Arrays;

public class sortColors {
public static void main(String[] args) {
	int[] arr= {2,1,2,0,2,1,0,1};
	int low=0,mid=0,high=arr.length-1;
	while(mid<=high) {
		if(arr[mid] == 0) {
			int temp=arr[low];
			arr[low]=arr[mid];
			arr[mid]=temp;
			low++;
			mid++;
		}
		else if(arr[mid]==1) {
			mid++;
		}
		else {
			int temp=arr[mid];
			arr[mid]=arr[high];
			arr[high]=temp;
			high--;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
