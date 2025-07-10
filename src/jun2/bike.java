package jun2;

public class bike extends cab {
private String helmet;
private String color;
public bike(String helmet, String color) {
	super();
	this.helmet = helmet;
	this.color = color;
}
public String getHelmet() {
	return helmet;
}
public void setHelmet(String helmet) {
	this.helmet = helmet;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
void book() {
	System.out.println("this is bike book");
}
@Override
void rideDetails() {
	System.out.println("this is bike helmet details"+helmet);
	System.out.println("this is bike color"+color);
}


}

