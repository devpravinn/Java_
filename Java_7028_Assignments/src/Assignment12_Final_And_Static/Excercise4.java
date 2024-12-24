package Assignment12_Final_And_Static;

public class Excercise4 {
	static int a;
	static int b;
	
	static {
		//static blocks/variables/methods are loaded in the memory while loading the class by the class loader
		System.out.println("Static block called");
		a = 10;
		b = 20;
	}
	
	public static void main(String [] args) {
		System.out.println("Main method started");
		//While running a program static block will get called
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
}
