package comparator;

public class penComparator implements Comparable {
String price;
public penComparator(String price) {
	super();
	this.price=price;
}

@Override
public int compareTo(Object o) {
	penComparator p=(penComparator) o;
	return this.price.compareTo(p.price);
}
}
