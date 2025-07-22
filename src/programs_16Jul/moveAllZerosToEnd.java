package programs_16Jul;
//MOVING ZEROS TO END 
import java.util.Arrays;

public class moveAllZerosToEnd {
public static void main(String[] args) {
	int[] arr= {0,0,6,5,3,0,8};
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i] != 0) {
			arr[j]=arr[i];
			if(i!=j) {
			arr[i]=0;
		}
		j++;	
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
