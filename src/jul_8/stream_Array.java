package jul_8;

import java.util.Arrays;

public class stream_Array {
public static void main(String[] args) {
	int arr[] = {1,2,34,5};
	Integer a1= Arrays.stream(arr).map(a->{
		System.out.println("map appiled");
		return a+10;
	}).reduce((a,b)->a+b).getAsInt();
	System.out.println(a1);
}
}
