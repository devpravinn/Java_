package Assignment13_ExceptionHandling;

//How to throw your own exception explicitly using throw keyword
public class Excercise7_MyOwnException extends Exception {
	public Excercise7_MyOwnException(String msg) {
		super(msg);
	}
}
