package Assignment8_Constructor_Super_This;
//Excercise5
public class SuperVariableSubclass extends SuperVariableParent {
	int num = 110;
	
	void printNumber() {
		//super.variable_name -- syntax
		System.out.println(super.num);
	}
	
	public static void main(String[] args) {
		SuperVariableSubclass obj = new SuperVariableSubclass();
		obj.printNumber();
	}
}
