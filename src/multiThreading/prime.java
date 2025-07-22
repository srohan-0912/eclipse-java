package multiThreading;
//CHECKING PRIME USING PRIME NUMBER
public class prime extends Thread{
int num;

public prime(int num) {
	super();
	this.num = num;
}

public void run() {
	int cnt=0;
	for(int i=1;i<=num;i++) {
		if(num%i == 0) {
			cnt++;
		}
		
	}
	if(cnt==2) System.out.println(num);
	
}

}
