package Assignment10_Polymorphism;

public class Excercise2_Parent {
	//Simple method overloading examples
	void demo(int a) {
		System.out.println("a: "+a);
	}
	void demo(int a, int b) {
		System.out.println("a and b: "+a+","+b);
	}
	double demo(double a) {
		System.out.println("double a: "+a);
		return a*a;
	}
	int demo(int a, int b, int c) {
		return a+b+c;
	}
}
