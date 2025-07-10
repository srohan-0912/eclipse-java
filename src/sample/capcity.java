package sample;

import java.util.Arrays;

public class capcity {
public static void main(String[] args) {
   int [] a= {3,4,5,2};
   int max=0;
   int j=a.length-1;
   int[] b=new int[a.length];
   for(int i=a.length-1;i>=0;i--) {
	   max=Math.max(a[i],max);
	   
	   b[j--]=max;
   }
   
   System.err.println(Arrays.toString(b));
}
}
