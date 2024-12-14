package Assignment2_Class_Method_Calling;

public class DataType_Char {
	//Example to demonstrate char type of variable
	// And calling method and variable from main method
	char a = 'J';
	char b = 'A';
	char c = 'V';
	char d = 'A';
	
	void join() {
		System.out.println("The character value is:"+a+b+c+d);
	}
	public static void main(String[] args) {
		DataType_Char obj = new DataType_Char();
		obj.join();
	}
}
