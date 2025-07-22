package multiThreading;

public class threadTwo extends Thread {
 public void run() {
	 for(int i=0;i<45;i++) {
		 if(i%2!=0) {
			 System.out.println("GThreadOdd:"+i);
		 }
	 }
 }
}
