package exception;

public class ageException extends RuntimeException{

	public ageException() {
		System.out.println("age exception occur");
	}
	@Override
	public void printStackTrace() {
		System.err.println("age is less than 18");
	}
}
