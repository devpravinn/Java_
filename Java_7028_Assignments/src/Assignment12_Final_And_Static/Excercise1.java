package Assignment12_Final_And_Static;

public class Excercise1 {
//	Simple static example
//	For static members only a single copy is maintained for a single class
//	There can be multiple instances of a class but the static variable will be one only and that will be shared among all the members of the class.
	static int count = 0;
	
	public void increment() {
		count++;
	}
	public static void main(String [] args) {
		Excercise1 obj1 = new Excercise1();
		Excercise1 obj2 = new Excercise1();
		obj1.increment(); // count variable updates once
		obj2.increment(); // same count variable updates once more
		System.out.println("Obj1: count is = "+obj1.count);
		System.out.println("Obj2: count is = "+obj2.count);
	}
}
