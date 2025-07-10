package exception;

public class tryCatch {
public static void main(String[] args) {
	System.out.println("st");
	int a=10;
	int b=0;
	
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch(NullPointerException t1){
		t1.printStackTrace();	
	}
	catch(ArithmeticException t1) {
		t1.printStackTrace();
	}
	System.out.println("end");
	
}
}
