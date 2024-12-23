package Assignment11_Abstraction;

public class Excercise1_TestAbstractClass extends Excercise1_AbstractClass {
	@Override //It is a good practice to use @Override annotation while you are overriding some method
	public void disp2() {
		System.out.println("I am overriding the abstract method of Excercise1_AbstractClass class");
	}
	public static void main(String[] args) {
		Excercise1_TestAbstractClass obj = new Excercise1_TestAbstractClass();
		obj.disp2();
		obj.disp1();
	}
}
