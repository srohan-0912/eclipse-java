package prog_21July;

//Problem Description:
//Given two integer arrays nums1 and nums2, return their intersection. Each element in the result should appear as many times as it appears in both arrays.
//Example 1:
//Input: nums1 [4,9,5], nums2 = (9,4,9,8,4]
//Output: (4,9]


import java.util.*;
public class intersectionOfTwoArrayII {
public static void main(String[] args) {
	int[] n1= {4,9,8,5};
	int[] n2= {9,4,9,8,4};
    HashSet<Integer> set1=new HashSet<>();
    for(int num1:n1) {
    	set1.add(num1);
    }
    HashSet<Integer> set2=new HashSet<>();
    for(int num2:n2) {
    	if(set1.contains(num2)) {
    		set2.add(num2);
    	}
    	
    }
    int[] res=new int[set2.size()];
    int i=0;
    for(int add:set2) {
    	res[i++]=add;
    }
    System.out.println(Arrays.toString(res));
    
}
}
