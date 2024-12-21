package Assignment6_Access_Modifier;

public class Example1 {
	private void m1() {
		System.out.println("m1 - private");
	}
	void m2() {
		System.out.println("m2 - default");
	}
	protected void m3() {
		System.out.println("m3 - protected");
	}
	public void m4() {
		System.out.println("m4 - public");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		//Within a class you can access all the types of modifiers!
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}
