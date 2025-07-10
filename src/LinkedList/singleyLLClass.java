package LinkedList;

public class singleyLLClass {
public static void main(String[] args) {
	singleyLL s=new singleyLL();
	System.out.println(s.isEmpty());
	System.out.println(s.size());
	//APPEND
	System.out.println("............");
	System.out.println("append method");
	System.out.println(s.append(10));
	System.out.println(s.size());
	System.out.println(s.isEmpty());
	//PREPEND
	System.out.println("..............");
	System.out.println("prepend method:");
	System.out.println(s.prepend(20));
	System.out.println(s.size());
//	INSERT
	System.out.println("'''''''''''''''");
	s.append(30);
	System.out.println("printing data:");
	s.insert(1,200);
	s.print();
	
	//DELETE only first element
//	System.out.println("...........");
//	System.out.println("delete the first element:");
//	s.deleteFirst();
//	s.print();
	
//	//delete based on  index
//	System.out.println("''''''''''''");
//	System.out.println("delete based on index");
//	s.deleteind(2);
//	s.print();
	
	//DELETE THE ELEMENT AT LAST
	
//System.out.println("''''''''''''");
//s.deleteLast();
//s.print();
	
	//DELETE ALL THE ELEMENT
	System.out.println(".............");
	System.out.println("the list is deleted ");
	s.deleteAll();
	s.print();

	
}
}
