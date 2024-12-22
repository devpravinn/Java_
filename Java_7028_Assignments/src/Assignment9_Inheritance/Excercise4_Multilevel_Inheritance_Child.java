package Assignment9_Inheritance;

public class Excercise4_Multilevel_Inheritance_Child extends Excercise4_Multilevel_Inheritance_Father {
//	Demonstrating multilevel inheritance
	public void Child() {
		System.out.println("I am the child class");
	}
	
	public static void main(String[] args) {
		Excercise4_Multilevel_Inheritance_Child obj = new Excercise4_Multilevel_Inheritance_Child();
		obj.grandFather();
		obj.father();
		obj.Child();
	}
}
