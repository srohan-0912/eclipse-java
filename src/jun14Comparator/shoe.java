package jun14Comparator;

public class shoe implements Comparable{
String type;
int price;
String size;
String brand;

public shoe(String type,int price,String size,String brand) {
	super();
	this.type=type;
	this.price=price;
	this.size=size;
	this.brand=brand;	
}
@Override 
public int compareTo(Object o) {
	shoe s1=(shoe)o;
	return this.price-s1.price;
}


}
