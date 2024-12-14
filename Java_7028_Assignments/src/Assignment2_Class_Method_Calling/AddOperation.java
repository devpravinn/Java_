package Assignment2_Class_Method_Calling;

public class AddOperation {
	int add_int(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		AddOperation obj = new AddOperation();
		int z = obj.add_int(10, 20);
		System.out.println(z);
	}
}
