package jun2;

import java.util.*;

public class driverCab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for car");
		System.out.println("press 2 for bike");
		System.out.println("press 3 for auto");
		cab c1;
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			c1 = new car("black", "101");
			if (c1 instanceof car) {
				car a1 = (car) c1;
			}
			c1.book();
			c1.driverDetails();
			c1.rideDetails();
			break;
		}
		case 2: {
			c1 = new bike("abc", "indian");
			if (c1 instanceof bike) {
				bike b1 = (bike) c1;
			}
			c1.book();
			c1.driverDetails();
			c1.rideDetails();
			break;
		}
		case 3: {
			c1 = new auto("abc", "indian");
			if (c1 instanceof auto) {
				auto b1 = (auto) c1;
			}
			c1.book();
			c1.driverDetails();
			c1.rideDetails();
			break;
		}
		}
	}
}
