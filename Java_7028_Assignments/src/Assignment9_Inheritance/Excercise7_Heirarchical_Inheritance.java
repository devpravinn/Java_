package Assignment9_Inheritance;

//Hierarchical Inheritance

class A{
	public void methodA() {
		System.out.println("method of class A");
	}
}
class B extends A{
	public void methodB() {
		System.out.println("method of class B");
	}
}
class C extends A{
	public void methodC() {
		System.out.println("method of class C");
	}
}
class D extends A{
	public void methodD() {
		System.out.println("method of class D");
	}
}
public class Excercise7_Heirarchical_Inheritance {
	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
		D obj3 = new D();
		//All the above classes can access the method of class A
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();
	}
}
