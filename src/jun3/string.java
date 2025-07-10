package jun3;

public class string {
	public static void main(String[] args) {
		String s1="gaj12@#%^";
		String rev="";
		
for(int i=s1.length()-1;i>=0;i--) {
	rev+=s1.charAt(i);
    }
System.out.print(rev);
 }

}
