package scenarioQuestion;
import java.util.*;
//1,2,3   op:-1 2 3 6 9 8 7 4 5
//4,5,6       
//7,8,9     
public class twoDMatrix {
public static void main(String[] args) {
	  int[][] a = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	List<Integer> res=new ArrayList<>();
	int n=a.length;//row
	int m=a[0].length;   //col
	int top=0;
	int bottom=n-1;  //row
	int left=0;
	int right=m-1;  //col
	while(left<=right && top<=bottom) {
			for(int i=left;i<=right;i++) {
				res.add(a[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				res.add(a[i][right]);
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					res.add(a[bottom][i]);
					
	            }  bottom--;
			}
	            if(left<=right){
	                for(int i=bottom;i>=top;i--){
	                    res.add(a[i][left]);
	                }
	                left++;
	            }
	}
	   System.out.println(res);
	
}
}
