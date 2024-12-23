package Assignment10_Polymorphism;

public class Excercise6_BindDynamic_SuperClass {
	protected String val;
	void display(String str) {
		val = "Base Class Function ".concat(str);
		System.out.println(val);
	}
}
