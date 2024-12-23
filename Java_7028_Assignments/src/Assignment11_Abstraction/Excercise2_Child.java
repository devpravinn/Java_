package Assignment11_Abstraction;

public class Excercise2_Child extends Excercise2_Parent_AbstractClass {
	int x,y,z;
	
	void get(int a, int b) {
		x = a;
		y = b;
	}
	void add() {
		z = x+y;
	}
	void display() {
		System.out.println("The Addition is : " + z);
	}
}
