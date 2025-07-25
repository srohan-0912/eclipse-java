package prog_21July;

//Example 2:
//Input nums (2,2,2,2,2), target-2
//Output: (0,4)
//Explanation. The number 2 appears from index 0 to 4
//Test Cases:
//Input: [5,7,7,8,8.10), 8 Output: (3,4)
//Input: [2,2,2,2,2,2 Output: (0,4]
//Input: [5,7,7,8,8.10), 7→ Output: (1.2)
//Input: [1,2,3], 4→ Output:
//[-1,-1]
//Input: (1.2.4.3) 4
//Output: [2.2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printTargetInd {
public static void main(String[] args) {
//	int[] nums= {2,2,2,2,2};
//	int tar=2;
	int[] nums= {5,7,7,8,8,10};
	int tar=8;
	int[] res=search(nums,tar);
	System.out.println(Arrays.toString(res));
}
	
	public static int[] search(int[] nums,int tar) {
		List<Integer> list=new ArrayList<>();
	for(int i=0;i<nums.length;i++) {
		if(nums[i] == tar) {
			  list.add(i);
		}
	}
	if(list.isEmpty()) {
		return new int[] {-1,1};
		}
	return new int[] {list.get(0),list.get(list.size()-1)};
}
}
