package comparator;
//jun 14
//comparable interface 
public class laptop implements Comparable {
	String brand;
	int price;
	
	public laptop(String brand,int price) {
		super();
		this.price=price;
		this.brand=brand;
	}
	
	
	public int compareTo(Object o) {
		laptop l1=(laptop)o;
		if(this.price == l1.price)
			return 0;
		if(this.price > l1.price)
			return 1;
		
			return -1;
		//return (int)(this.price>l1.price);
	}
}
