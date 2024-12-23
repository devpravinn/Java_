package Assignment10_Polymorphism;

public class Excercise1 {
	//method overloading by changing data type of arguments
	void sum(int a, int b) {
		System.out.println("Sum is: "+(a+b));
	}
	
	void sum(double a, double b) {
		System.out.println("Sum is: "+(a+b));
	}
	
	public static void main(String[] args) {
		Excercise1 obj = new Excercise1();
		obj.sum(1, 2);
		obj.sum(3.4, 5.6);
	}
}
