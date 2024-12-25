package Assignment13_ExceptionHandling;
import java.io.IOException;
public class Excercise6_Test {
	public static void main(String[] args) {
//		Excercise6 obj = new Excercise6(); //not so better practice
		try {
			Excercise6 obj = new Excercise6(); //better practice
			obj.myMethod(1);
		} catch(IOException e) {
			System.out.println("Exception caught: "+e);
		} catch(ClassNotFoundException e) {
			System.out.println("Exception caught: "+e);
		}
	}
}
