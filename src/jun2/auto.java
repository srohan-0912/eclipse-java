package jun2;

public class auto extends cab{
private String color;
private String number;
public auto(String color, String number) {
	super();
	this.color = color;
	this.number = number;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
@Override
void book() {
	System.out.println("this is bike book");
}
@Override
void rideDetails() {
	System.out.println("this is auto number details"+number);
	System.out.println("this is auto color"+color);
}



}
