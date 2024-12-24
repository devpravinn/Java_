package Assignment12_Final_And_Static;

public class Excercise5 {
	int a; //initialized to zero (Global variables are initialized by default)
	//initialized to zero only when the class is loaded
	//not for each object created -> run the code to understand
	static int b;
	
	Excercise5(){
		// Constructor incrementing static variable b
		b++;
	}
	
	public void showData() {
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
}
