package Assignment10_Polymorphism;

public class Excercise3 {
	//another simple example of method overloading
	void find(int l, int b) {
		System.out.println("Area is: "+(l*b));
	}
	
	void find(int l, int b, int h) {
		System.out.println("Area is: "+(l*b*h));
	}
	
	public static void main(String[] args) {
		Excercise3 obj = new Excercise3();
		obj.find(8, 5);
		obj.find(4, 6, 2);
	}
}
