package jun2;

public class car extends cab {
	private String name;
	private String license;
	public car(String name, String license) {
		super();
		this.name = name;
		this.license = license;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	@Override
	void book() {
		System.out.println("this is bike book");
	}
	@Override
	void rideDetails() {
		System.out.println("this is car name"+name);
		System.out.println("this is car license details"+license);
	}



	}
