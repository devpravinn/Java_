package Assignment13_ExceptionHandling;

public class Excercise5 {
	//Example of throws clause
	static void throwMethod() throws NullPointerException{
		System.out.println("Inside the throwMethod");
		throw new NullPointerException("Demo");
		//throw is used to throw the exception
		//throws is used to delegate the exception upwards in class hierarchy and if it is written in the try block the exception will be caught by the catch block of the corresponding try block  
	}
	
	public static void main(String[] args) {
		try {
			throwMethod();
		} catch(NullPointerException exp) {
			System.out.println("The exception got caught: "+exp);
		}
	}
}
