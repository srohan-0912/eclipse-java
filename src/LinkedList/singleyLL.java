package LinkedList;
  //CREATION OF SINGLEY LL
public class singleyLL {
Node head;
Node tail;
int size;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
	
}
public boolean isEmpty() {
	return head==null && tail==null?true:false;
}
	public int size(){
		return this.size;
	}
	//APPPEND METHOD
	public boolean append(int data) {
		Node node=new Node(data);
		if(isEmpty()) {
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
	//PREPEND
	public boolean prepend(int data) {
		Node node=new Node(data);
		if(isEmpty()) {
			head=node;
			tail=node;
		}
		else {
			node.next=head;
			head=node;
		}
		size++;
		return true;
	}
	//PRINT DATA
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	//INSERT
	public  boolean insert(int ind,int data) {
		if(ind<=0)  return prepend(data);
		if(ind>size) return append(data);
		
		Node temp=head;
		Node prev=null;
		int i=0;
		  
		while(ind!=i) {
			prev=temp;
			temp=temp.next;
			i++;
		}
		Node node=new Node(data);
		prev.next=node;
		node.next=temp;
		size++;
		return true;
	}
	
//	//delete first element
//	public boolean deleteFirst() {
//		if(!isEmpty()) {
//			head=head.next;
//		}
//		size--;
//		return true;
//		
//	}
	
//	//delete based on index
//	public boolean deleteind(int ind) {
//	  Node temp=head;
//	  Node prev=null;
//	  int i=0;
//	  while(ind!=i) {
//		  prev=temp;
//		  temp=temp.next;
//		  i++;
//	  }
//	  prev.next=temp.next;
//	  size--;
//	  return true;
//	}
	
	//DELETE AT LAST
//	public boolean deleteLast() {
//		if(isEmpty()) {
//			System.out.println("it os empty");
//			return false;
//		}
//		if(size==1) {
//			head=null;
//			tail=null;
//			return true;
//		}
//		else {
//	Node temp=head;
//	while(temp.next !=tail) {
//		temp=temp.next;
//	}
//	temp.next=null;
//	tail=temp;
//	size--;
//	return true;
//		}
		public boolean deleteAll() {
			if(!isEmpty()) {
				head=null;
				tail=null;
				size=0;
				}
			return true;
			}
}
