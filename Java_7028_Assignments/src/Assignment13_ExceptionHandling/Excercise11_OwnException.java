package Assignment13_ExceptionHandling;

public class Excercise11_OwnException extends Exception {
	//Create your own exception in java
	//(These user defined exceptions are little complicated for understanding so whenever you revise study these properly)
	public Excercise11_OwnException(int msg) {
		super(String.valueOf(msg));
	}
	public Excercise11_OwnException(float msg) {
		super(String.valueOf(msg));
	}
	public Excercise11_OwnException(char msg) {
		super(String.valueOf(msg));
	}
	public Excercise11_OwnException(String msg) {
		super(msg);
	}
	public Excercise11_OwnException() {
		
	}
}
