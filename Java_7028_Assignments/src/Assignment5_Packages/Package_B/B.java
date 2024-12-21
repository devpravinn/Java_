package Assignment5_Packages.Package_B;

import Assignment5_Packages.Package_A.A;
import Assignment5_Packages.Package_C.C;
public class B {
	public void m1() {
		System.out.println("M1() method of class - B");
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.m1();
		b.m1();
		c.m1();
	}
}
