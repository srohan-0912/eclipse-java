package methodShadowing;

public class shadowing {
public static void main(String[] args) {
	animal a1=new dog();  // reference is animal,obj is dog
	a1.sound();  //using shadowing it takes only what we have created and display the output
}
}
