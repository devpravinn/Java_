package Assignment8_Constructor_Super_This;

public class Excercise7 {
	//Constructor chaining using this keyword
	public Excercise7(){
		System.out.println("Default Constructor");
	}
	public Excercise7(String str) {
		this();
		System.out.println("Parameterised constructor with a single parameter");
	}
	public Excercise7(String str, int num) {
		this(str);
		System.out.println("Parameterised constructor with double parameters");
	}
	public Excercise7(String str, int num1, int num2) {
		this(str,num1);
		System.out.println("Parameterised constructor with three parameters");
	}
	
	public static void main(String[] args) {
		Excercise7 obj = new Excercise7("Pravin",100,110);
	}
	
}
