package jun2;
//EARLY INSTATIATION
public class cab {
private driver d1=new driver("roma","101");

public driver getD1() {
	return d1;
}

public void setD1(driver d1) {
	this.d1 = d1;
}
void book() {
	System.out.println("this is cab book");
}
void rideDetails() {
	System.out.println("this is cab ride details");
}
void driverDetails() {
	System.out.println("driver name is:"+ d1.getName());
	System.out.println("driver id is"+d1.getName());

}

}