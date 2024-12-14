package Assignment2_Class_Method_Calling;

public class DataType_Boolean {
	//Example to demonstrate 
	/* a. boolean type of variable
	 * Calling method and variable from main method
	 */
	boolean a = true;
	void check() {
		if(a==true) {
			a = false;
			System.out.println("The boolean value is: " + a);
		}
	}
	public static void main(String[] args) {
		DataType_Boolean obj = new DataType_Boolean();
		obj.check();
		System.out.println(obj.a);
	}
}
