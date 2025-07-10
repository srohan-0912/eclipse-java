package comparator;
//jun 14
//comparable interface

public class laptopDriver {
public static void main(String[] args) {
	laptop l1=new laptop("abc",1000);
	laptop l2=new laptop("acng",1000);
	laptop l3=new laptop("cncc",2000);
  
	System.out.println(l2.compareTo(l1.price));
}
}
