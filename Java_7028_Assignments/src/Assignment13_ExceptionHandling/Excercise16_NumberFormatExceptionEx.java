package Assignment13_ExceptionHandling;

public class Excercise16_NumberFormatExceptionEx {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println("Number format exception occured");
		}
	}
}
