package Assignment2_Class_Method_Calling;

public class DataType_Int {
	int a = -15000;
	int b = -20000;
	//Example to demonstrate:
	//One method and in same class we will have the main method
	void add() {
		int c = a + b;
		System.out.println("The value is: " + c);
	}
	
	public static void main(String [] args) {
		DataType_Int obj = new DataType_Int();
		obj.add();
	}
}
