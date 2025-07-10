package exception;

public class ageExe {
public static void main(String[] args) {
	int age=18;
	try{
		if(age<=18) {
			throw new ageException();
	}
		else {
			System.err.println("not occur");
		}
	}
	catch(ageException e){
		System.err.println("catch excep");
	}
}
}
