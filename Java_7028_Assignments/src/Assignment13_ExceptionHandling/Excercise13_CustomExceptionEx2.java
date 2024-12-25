package Assignment13_ExceptionHandling;

public class Excercise13_CustomExceptionEx2 {
	public static void main(String[] args) {
		try {
			throw new Excercise13_CustomExceptionEx1("Custom");
			//I am throwing user defined custom exception above
		} catch(Excercise13_CustomExceptionEx1 e) {
			System.out.println("Hi this is my catch block");
			System.out.println(e);
		}
	}
}
