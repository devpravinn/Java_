package Assignment12_Final_And_Static;

public class Excercise9 {
	
//	Blank final variable
	final int MAX_VALUE;
	
	Excercise9(){
		//It must be initialized in constructor
		MAX_VALUE = 100;
	}
	
	void myMethod() {
		System.out.println(MAX_VALUE);
	}
	
	public static void main(String args[]) {
		Excercise9 obj = new Excercise9();
		obj.myMethod();
	}
	
}
