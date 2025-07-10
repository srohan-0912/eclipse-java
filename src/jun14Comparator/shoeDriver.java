package jun14Comparator;

import java.util.Arrays;

public class shoeDriver {
public static void main(String[] args) {
	shoe s1=new shoe("sneaker",1200 ,"s","casual");
	shoe s2=new shoe("nike",1300," m","boots");
	shoe s3=new shoe("adidas",1500,"s","flipflop");
	shoe s4=new shoe("puma",4000,"xl","canvas");
	shoe s5=new shoe("sneaker",150000 ,"m","casual");
	shoe s6=new shoe("nike",1300," xl","boots");
	shoe s7=new shoe("adidas",1500,"m","flipflop");
	shoe s8=new shoe("puma",4000,"s","canvas");
	
	shoe[] s= {s1,s2,s3,s4,s5,s6,s7,s8};
	System.out.println("before sort");
	for(shoe sh:s) {
		System.out.println(sh.brand+" "+sh.price+" "+sh.size+" "+sh.type);
	}
	System.out.println("...........");
	
	System.out.println("brand sort");
	Arrays.sort(s,new brandComparator());
	for(shoe sh:s) {
		System.out.println(sh.brand+" "+sh.price+" "+sh.size+" "+sh.type);
	}
	System.out.println("...........");
	
	System.out.println("type sort");
	Arrays.sort(s,new typeComparator());
	for(shoe sh:s) {
		System.out.println(sh.brand+" "+sh.price+" "+sh.size+" "+sh.type);
	}
	System.out.println("...........");
	
	
	System.out.println("size sort");
	Arrays.sort(s,new sizeComparator());
	for(shoe sh:s) {
		System.out.println(sh.brand+" "+sh.price+" "+sh.size+" "+sh.type);
	}
	System.out.println("...........");
    
	
    
	
}	
}
