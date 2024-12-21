package Assignment8_Constructor_Super_This;

public class SuperMethodCallingSubclass extends SuperMethodCalling{
	void display() {
		System.out.println("Child class method");
	}
	void printMsg() {
		//This will call the overriding method
		display();
		
		//This will call the overridden method 
		super.display();
	}
	public static void main(String[] args) {
		SuperMethodCallingSubclass obj = new SuperMethodCallingSubclass();
		obj.printMsg();
	}
}
