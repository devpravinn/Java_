package Assignment8_Constructor_Super_This;

public class Excercise2 {
	
	public Excercise2() {
		System.out.println("No parameter constructor | Default constructor");
	}
	public Excercise2(int a) {
		System.out.println("Parameterized constructor with argument value: "+a);
	}
	public static void main(String[] args) {
		Excercise2 obj1 = new Excercise2();
		Excercise2 obj2 = new Excercise2(10);
	}
}
