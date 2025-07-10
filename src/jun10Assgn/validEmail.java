package jun10Assgn;

public class validEmail {
public static void main(String[] args) {
	String[] s= {"abc@gmail.com","cda@"};
	for(String str:s) {
		check(str);
	}
	
	
}
public static void  check(String str) {
	if(str.matches("[a-zA-Z0-9]+@(gmail.com|yahoo.com|hotmail.com)")) {
		System.out.println("the email is valid");
	}
	else {
		System.out.println("not valid");
	}
}
}
