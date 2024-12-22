package Assignment9_Inheritance;

public class Excercise1_Single_Inheritance_Child extends Excercise1_Single_Inheritance {
	
	public void methodB() {
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) {
		Excercise1_Single_Inheritance_Child obj = new Excercise1_Single_Inheritance_Child();
		obj.methodA(); //calling super class method
		obj.methodB(); //calling local method
	}
}
