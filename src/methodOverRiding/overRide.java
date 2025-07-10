package methodOverRiding;

public class overRide {
public static void main(String[] args) {
	animal a1=new dog(); //using override it will check child class obj to display 
	animal a2=new animal();
	
	a2.sound();
	a1.sound();
}
}
