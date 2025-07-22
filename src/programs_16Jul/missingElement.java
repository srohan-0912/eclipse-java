package programs_16Jul;
//find the missing number in given range
public class missingElement {
public static void main(String[] args) {
	int[] n= {1,2,3,5};
	int sum=0;
	int Nsum=0;
	int len=n.length+1;
	for(int i=1;i<=len;i++) {
		Nsum+=i;
	}
	for(int num:n) {
		sum+=num;
	}
	int diff=Nsum-sum;
	System.out.println(diff);
	
}
}
