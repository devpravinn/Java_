package Assignment8_Constructor_Super_This;

public class Excercise_10 {
	//Designing singleton pattern
	private static Excercise_10 myobj;
	//Create a private constructor
	private Excercise_10() {
		
	}
	
	//Create a static method to get instance.
	//We need to return something of the type of Excercise_10
	public static Excercise_10 getInstance() {
		if(myobj == null) {
			myobj = new Excercise_10();
		}
		return myobj;
	}
	public void getSomeThing() {
		//do something here
		System.out.println("I am here...");
	}
	public static void main(String[] args) {
		Excercise_10 obj = Excercise_10.getInstance();
		obj.getSomeThing();
	}
}
