package Assignment13_ExceptionHandling;

public class Excercise7_MyOwnExceptionEmployeeTest {
	static void employeeAge(int age) throws Excercise7_MyOwnException {
		if (age < 0) {
			throw new Excercise7_MyOwnException("Age can't be less than zero");
		} else {
			System.out.println("Input is valid");
		}
	}

	public static void main(String[] args) {
		try {
			employeeAge(-2);
		} catch (Excercise7_MyOwnException e) {
			e.printStackTrace();
		}
	}
	/*
	 * e.printStackTrace(); is a commonly used method in Java that prints the stack
	 * trace of an exception to the standard error stream (System.err). This is
	 * primarily used for debugging purposes, as it helps developers understand
	 * where an exception occurred and how the program reached that point.
	 * 
	 * Detailed Explanation: Where it Comes From:
	 * 
	 * printStackTrace() is a method of the Throwable class, which is the superclass
	 * of all errors and exceptions in Java. Any object of type Exception or Error
	 * inherits this method. What it Does:
	 * 
	 * When printStackTrace() is called on an exception object, it prints: The
	 * exception's type (e.g., java.lang.NullPointerException). The message
	 * associated with the exception (if any). The sequence of method calls (stack
	 * trace) that led to the exception.
	 */
}
