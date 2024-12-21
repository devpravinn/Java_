package Assignment6_Access_Specifier.Test;
import Assignment6_Access_Modifier.Example1;
public class TestModifiers extends Example1{
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.m4(); // public -- that's why can be used outside of package but inside the same project -- public members can be used anywhere in the same project
		obj.m3(); //this won't work -- protected -- can be accessed outside of the package if the class using it is the child class (so that is why I extended the class Example1 and will be now able to access m3 using the instance of the TestModifiers class)
		TestModifiers TMobj = new TestModifiers();
		TMobj.m3(); //now this protected member can be accessed
		
		obj.m1() //private members can't be accessed outside its class
		
		obj.m2() //default members can be accessed within the package itself
	}
}
