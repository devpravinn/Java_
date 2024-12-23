package Assignment11_Abstraction;

public class Excercise4_Child extends Excercise4_Parent_AbstractClass {
	String name;
	
	@Override
	void getVal(String name) {
		this.name = name;
	}
	
	@Override
	void display() {
		System.out.println("Hello "+name);
	}
}
