package LinkedList;
//LC-21 MERGE SORTED LIST
public class insertmain {
	public static void main(String[] args) {
	insertLL l1=new insertLL();
	System.out.println("enter the list1:");
	l1.append(10);
   l1.append(20);
   l1.append(40);
   l1.print();
    
    insertLL l2=new insertLL();
    System.out.println("enter the list2");
    l2.append(10);
    l2.append(30);
    l2.append(60);
    l2.print();
    
	
    System.out.println("AFTER THE MERGE INTERVAL:");
    insertLL l3 = new insertLL();
    insertLL.Node mergedHead = l3.mergeTwoNumber(l1.getHead(), l2.getHead());
    l3.print(mergedHead);
}
}