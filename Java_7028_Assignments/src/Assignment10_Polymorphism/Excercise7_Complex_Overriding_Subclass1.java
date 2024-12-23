package Assignment10_Polymorphism;

public class Excercise7_Complex_Overriding_Subclass1 extends Excercise7_Complex_Overriding_Superclass {
	void display() {
		super.display();
		text="Excercise7_Complex_Overriding_Subclass1's";
		System.out.println(text+" function called");
	}
}
