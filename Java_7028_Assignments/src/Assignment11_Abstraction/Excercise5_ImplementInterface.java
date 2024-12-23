package Assignment11_Abstraction;

public class Excercise5_ImplementInterface implements Excercise5_Interface1, Excercise5_Interface2 {
	public void myMethod() {
		System.out.println("Multiple inheritance example using interface");
	}
	public static void main(String[] args) {
		Excercise5_ImplementInterface obj = new Excercise5_ImplementInterface();
		obj.myMethod();
	}
}
