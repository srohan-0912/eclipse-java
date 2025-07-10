package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class studentDriver {
public static void main(String[] args) {
	HashSet<student> s=new HashSet<>();
	s.add(new student("Rohan",104) );
	s.add(new student("samp",102) );
	s.add(new student("Asanji",103) );
	s.add(new student("bsanjy",101) );
	//creating List to store set
	ArrayList a=new ArrayList();
	a.addAll(s);
	Collections.sort(a);  //SORTING 
	 for(Object o:a) {
		 System.out.println(o);
	 }
	 System.out.println("'''''''");
	 a.remove(new student("Rohan",104) );//REMOVING
	
	 for(Object o:a) {
		 System.out.println(o);
	 }

}
}
