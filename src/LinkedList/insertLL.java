package LinkedList;
//LC-21 MERGE SORTED LIST
public class insertLL {
  Node tail;
  Node head;
  int size;
  
  class Node{
	  int data;
	  Node next;
	 Node(int data){
		  this.data=data;
	  } 
  }
  public void print() {
	  Node temp=head;
	  while(temp!=null) {
		  System.out.println(temp.data);
		  temp=temp.next;
	  }
	  System.out.println();
  }

  // NEW METHOD for getHead
  public void print(Node head) {
      Node temp = head;
      while (temp != null) {
          System.out.println(temp.data);
          temp = temp.next;
      }
      System.out.println();
  }
  
  public boolean append(int data) {
	  Node node=new Node(data);
	  if(head ==null) {
		  head=node;
		  tail=node;
		 
	  }
	  else {
		 tail.next=node;
		 tail=node;
		 
	  }
	  size++;
	  return true;
  }
  
  public Node mergeTwoNumber(Node l1, Node l2) {
	  Node dummy=new Node(-1);
	  Node curr=dummy;
	  while(l1 != null && l2 !=null) {
		  if(l1.data <l2.data) {
			  curr.next=l1;
			  curr=l1;
			  l1=l1.next;
		  }
		  else {
			  curr.next=l2;
			  curr=l2;
			  l2=l2.next;
		  }
		  
	  }
	  if(l1 != null) {
		  curr.next=l1;
		  curr=l1;
		  l1=l1.next;
	  }
	  else {
		  curr.next=l2;
		  curr=l2;
		  l2=l2.next;
	  }
	  return dummy.next;
  }
  public Node getHead() {
	  return this.head;
  }


}
