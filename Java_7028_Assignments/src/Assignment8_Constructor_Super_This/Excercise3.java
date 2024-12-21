package Assignment8_Constructor_Super_This;

public class Excercise3 {
	//Difference between a constructor and a method
	int value1;
	int value2;
//a constructor doesn't have any return type.
	Excercise3(){
		value1 = 10;
		value2 = 20;
		System.out.println("Inside Constructor");
	}
	
//  a method has a return type.
	public void display() {
		System.out.println("Value === "+ value1);
		System.out.println("Value === "+ value2);
	}
	
	public static void main(String[] args) {
		Excercise3 obj = new Excercise3();
		obj.display();
	}
}
