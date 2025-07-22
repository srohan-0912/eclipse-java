package multiThreading;

public class primeDriver {
public static void main(String[] args) {
	int st=20;
	int end=150;
	Thread[] t1=new Thread[end-st];
	int k=0;
	for(int i=st;i<end;i++) {
		t1[k++]=new prime(i);
	}
	for(int i=0;i<t1.length;i++) {
		t1[i].start();
	}
}
}
