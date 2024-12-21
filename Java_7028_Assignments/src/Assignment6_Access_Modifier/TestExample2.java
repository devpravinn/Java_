package Assignment6_Access_Modifier;

public class TestExample2 {
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.showDemo(); //this will run properly as it is public
		obj.testDemo(); //this method is private and can be used within the Example2 class only!
		obj.x = 5 //this is a private member(variable) of Example2 class and it cannot be accessed outside it
	}
}
