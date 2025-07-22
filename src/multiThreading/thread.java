package multiThreading;

public class thread {
public static void main(String[] args) {
	System.out.println("Mains st");
	threadone t1=new threadone();
	threadTwo t2=new threadTwo();
	t1.start();
	t2.start();
	System.out.println("Main ends");
	
}
}
