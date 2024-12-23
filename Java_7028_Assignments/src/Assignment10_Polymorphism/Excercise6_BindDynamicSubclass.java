package Assignment10_Polymorphism;

public class Excercise6_BindDynamicSubclass extends Excercise6_BindDynamic_SuperClass {
	void display(String str) {
		if(val==null) {
			super.display(str); //observe this carefully
			str = "Derived Class Function ".concat(str);
			System.out.println(str);
		}
	}
}
