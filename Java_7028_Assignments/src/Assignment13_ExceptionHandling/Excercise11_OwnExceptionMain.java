package Assignment13_ExceptionHandling;

public class Excercise11_OwnExceptionMain {

	public static void intFn() throws Excercise11_OwnException {
		System.out.println("Throwing OwnException from intFn()");
		throw new Excercise11_OwnException(10);
	}
	
	public static void floatFn() throws Excercise11_OwnException{
		System.out.println("Throwing OwnException from floatFn()");
		throw new Excercise11_OwnException();
	}
	
	public static void charFn() throws Excercise11_OwnException{
		System.out.println("Throwing OwnException from charFn()");
		throw new Excercise11_OwnException();
	}
	
	public static void stringFn() throws Excercise11_OwnException{
		System.out.println("Throwing OwnException from stringFn()");
		throw new Excercise11_OwnException();
	}
	
	public static void main(String[] args) {
		try {
			intFn();
		} catch(Excercise11_OwnException e) {
			e.printStackTrace();
		}
		try {
			floatFn();
		} catch(Excercise11_OwnException e) {
			e.printStackTrace();
		}
		try {
			charFn();
		} catch(Excercise11_OwnException e) {
			e.printStackTrace();
		}
		try {
			stringFn();
		} catch(Excercise11_OwnException e) {
			e.printStackTrace();
		}
	}
}
