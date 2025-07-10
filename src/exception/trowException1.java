package exception;

public class trowException1 {
	
	
public static void main(String[] args) {
	System.out.println("st");
	try {
		Thread.sleep(0);
		System.out.println(10/0);
	}
	catch(Exception e) {
//		e.printStackTrace();
		System.out.println("catch");
	}
	try {
		trowException1 t=null;
		System.out.println(t.toString());
	}
	catch(Exception e) {
		System.out.println("npe");
	}
	System.out.println("end");
}
}
