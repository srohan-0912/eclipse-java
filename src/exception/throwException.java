package exception;

public class throwException {
void a() throws InterruptedException{
	System.out.println("a st");
	Thread.sleep(0);
	System.out.println("a end");
}
void b() throws InterruptedException{
	System.out.println("b st");
	a();
	System.out.println("b end");
}
void c() throws InterruptedException{
	System.out.println("c st");
	b();
	System.out.println("c end");
}
public static void main(String[] args) throws InterruptedException {
	throwException t=new throwException();
	System.out.println("main st");
	t.c();
	System.out.println("main end");
}
}

