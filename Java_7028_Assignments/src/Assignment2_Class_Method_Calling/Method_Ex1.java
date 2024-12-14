package Assignment2_Class_Method_Calling;
/*Example to demonstrate int and float type of variable
 * calling method and variable from main method
 * Doing arithmetic operations in a program
 * How to call method of same class without creating a object
 * Display method is called from various other methods of the same class.
 * */
public class Method_Ex1 {
	int x = 10,y = 20;
	float z;
	
	void add() {
		z = x+y;
		display(z);
	}
	void sub() {
		z = x-y;
		display(z);
	}
	void mult() {
		z = x*y;
		display(z);
	}
	void div() {
		z = x/y;
		display(z);
	}
	void display(float num) {
		System.out.println(num);
	}
}
