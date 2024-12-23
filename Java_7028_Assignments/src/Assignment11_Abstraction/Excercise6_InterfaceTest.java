package Assignment11_Abstraction;

public class Excercise6_InterfaceTest implements Excercise6_InterfaceEx1,Excercise6_InterfaceEx2 {
	public void method1() {
		System.out.println("Implemented method1 of Excercise6_InterfaceEx1");
	}
	public void method2() {
		System.out.println("Implemented method2 of Excercise6_InterfaceEx2");
	}
	
	public static void main(String[] args) {
		Excercise6_InterfaceTest obj = new Excercise6_InterfaceTest();
		obj.method1();
		obj.method2();
	}
}
