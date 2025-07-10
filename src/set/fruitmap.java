package set;
//FRUIT 3 PROPERTIES:COLOUR,TASTE,PRICE AND STORE FRUIT IN MAP

public class fruitmap {
String color;
String taste;
int price;

public fruitmap(String color,String taste,int price){
	super();
	this.color=color;
	this.taste=taste;
	this.price=price;
}

@Override
public String toString() {
	return "[fruitmap color=" + color + ", taste=" + taste + ", price=" + price + "]";
}


}
