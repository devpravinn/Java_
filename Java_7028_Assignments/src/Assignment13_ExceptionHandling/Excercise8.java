package Assignment13_ExceptionHandling;

public class Excercise8 {
	//How to throw an already defined exception using throw keyword
	static int sum(int num1, int num2) {
		if(num1==0) {
			throw new ArithmeticException("First parameter is not valid");
		} else {
			System.out.println("Both parameters are correct!!");
			return num1+num2;
		}
	}
	
	public static void main(String[] args) {
		int res = sum(0,12);
		System.out.println(res);
		System.out.println("Continue Next Statements");
	}
	
}
