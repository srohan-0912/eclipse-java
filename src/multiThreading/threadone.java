package multiThreading;

public class threadone extends Thread {
public void run() {
	for(int i=0;i<45;i++) {
		try {
		    Thread.sleep(2000); // slows down each print
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(i%2 ==0) {
			System.out.println("threadEven:"+i);
		}
	}
}
}
