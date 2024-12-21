package Assignment8_Constructor_Super_This;

public class Excercise_11 extends Excercise_11_Superclass {
	Excercise_11(){
		/*super() must be added to the first line of constructor otherwise it would throw compilation error: " Constructor call must be the first statement in a constructor"
		 * */
		super();
		System.out.println("Constructor of subclass");
	}
	void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Excercise_11 obj = new Excercise_11();
		obj.display();
	}
}
