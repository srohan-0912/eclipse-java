package set;
//26-JULY-SET
import java.util.*;
public class car  implements Comparable{
	String brand;
	int price;
	public car(String name, int price) {
		super();
		this.brand = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[car name=" + brand + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, price);
	}

	@Override
	public boolean equals(Object obj) {
		car c = (car) obj;
		if(this.brand != c.brand)	return false;
		if(this.price != c.price)	return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		car c1=(car)o;
		return this.brand.compareTo(c1.brand);
	}
	  
  
}


