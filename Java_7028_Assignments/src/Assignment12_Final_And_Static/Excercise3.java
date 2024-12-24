package Assignment12_Final_And_Static;

public class Excercise3 {
	private String name;
	int a;
	private static String staticStr = "STATIC-STRING";
	
	public Excercise3(String n) {
		this.name = n;
	}
	public static void testStaticMethod() {
		System.out.println("I am in static method");
		//you can call static variables here
		System.out.println(Excercise3.staticStr);
		//you can not call instance variables here
//		System.out.println(a); //this will give error
	}
	public void testObjectMethod() {
		System.out.println("Hey I am in non-static method");
//		you can also call static variables here in non static method
		System.out.println(Excercise3.staticStr);
//		you can call instance variables here
		System.out.println("Name: "+this.name);
	}
	public static void main(String[] args) {
//		By using class name, you can call static method
		Excercise3.testStaticMethod();
		
		Excercise3 obj = new Excercise3("JBK-BEST-ONE");
//		Only by using instance reference you can call the instance variables/methods
		obj.testObjectMethod();
	}
}
