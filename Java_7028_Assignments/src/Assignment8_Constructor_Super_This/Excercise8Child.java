package Assignment8_Constructor_Super_This;

public class Excercise8Child extends Excercise8 {
	Excercise8Child(){
		//By default JVM adds a super() in the first line of every constructor that you write
		System.out.println("Constructor of the child class");
	}
	Excercise8Child(int num){
		//Compiler adds super() here at the first line of constructor implicitly.
		System.out.println("Constructor with argument");
	}
	void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Excercise8Child obj1 = new Excercise8Child();
		obj1.display();
		
		Excercise8Child obj2 = new Excercise8Child(10);
		obj2.display();
	}
}
