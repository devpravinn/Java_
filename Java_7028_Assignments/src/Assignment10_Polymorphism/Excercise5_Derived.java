package Assignment10_Polymorphism;

public class Excercise5_Derived {
	public static void main(String[] args) {
		//method calling from subclass/child object
		Excercise5_Child obj1 = new Excercise5_Child();
		obj1.method();
		
		//method calling from superclass/parent object
		Excercise5_Parent obj2 = new Excercise5_Child();//doubt -> What concept is this line using//up-casting
		//concept of dynamic dispatch
		obj2.method();
	}
	
}
