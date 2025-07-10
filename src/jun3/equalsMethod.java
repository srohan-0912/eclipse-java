package jun3;
//overriding equalsMethod
public class equalsMethod {
	int distance;
	public equalsMethod(int distance) {
		super();
		this.distance=distance;
	}
	//overriding
	public boolean equals(Object o) {   //upcasting
		equalsMethod d=(equalsMethod)o; //downcasting
		return this.distance==d.distance;
	}
	
	public static void main(String[] args) {
		equalsMethod e1=new equalsMethod(20);
		equalsMethod e2=new equalsMethod(20);
		System.out.println(e1.equals(e2));
	}
}
