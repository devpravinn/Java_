package Assignment13_ExceptionHandling;

public class Excercise9 {
	//Using throw keyword we can throw checked, unchecked and user-defined exceptions
	static void checkEligibilty(int studentAge, int studentWeight) {
		if(studentAge < 12 && studentWeight < 40) {
			throw new ArithmeticException("Student is not eligible for registration");
		} else {
			System.out.println("Entry is valid");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the registration process!!");
		checkEligibilty(10,39);
		System.out.println("Have a nice day");
	}
}
