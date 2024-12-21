package Assignment6_Access_Modifier;

public class Example2 {
	private int x = 56;
	public void showDemo() {
		System.out.println("The variable value is:: "+x);
	}
	private void testDemo() {
		System.out.println("It cannot be accessed in another class");
	}
}
