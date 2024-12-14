package Assignment2_Class_Method_Calling;

public class Excercise1 {
	/*Example to demonstrate 
	 * a.Float Variable
	 * b.How to call methods
	 * c.How to print global variables in method
	 * d.How to communicate between 2 classes one with main method and other without main
	*/
	int a; //global variable
	float b; //global variable
	String str; //global variable
	//An example to demonstrate float variable, how to call methods, how to print global variables in method, how to communicate between 2 classes one with main method and other without main
	public void operation1() {
		a = 10;
		b = 12.56f; 
		str = "Java";
	}
	
	public void operation2() {
		a = 20;
		b = 27f;
		str = "SELENIUM";
	}
	public void display() {
		System.out.println("The Integer Value is: "+a);
		System.out.println("The Float Value is: "+b);
		System.out.println("The String Value is: "+str);
	}
}
