package Assignment10_Polymorphism;

public class Excercise8_MethodOverriding_BankTest {
	public static void main(String[] args) {
		Excercise8_MethodOverriding_Bank obj = new Excercise8_MethodOverriding_Bank();
		System.out.println("Bank Rate of interest: "+obj.getRateOfInterest()+"%");
		Excercise8_MethodOverriding_Bank b1 = new Excercise8_MethodOverriding_AXISBank();
		Excercise8_MethodOverriding_Bank b2 = new Excercise8_MethodOverriding_ICICIBank();
		Excercise8_MethodOverriding_Bank b3 = new Excercise8_MethodOverriding_SBIBank();
		System.out.println("SBI Rate of Interest: "+b3.getRateOfInterest()+ "%");
		System.out.println("Axis Rate of Interest: "+b2.getRateOfInterest()+ "%");
		System.out.println("ICICI Rate of Interest: "+b1.getRateOfInterest()+ "%");
		
		/*
		 * Dynamic binding concept
		 * Parent object = new Child();
		 * Common method on both sides will be checked and the method of child will be called.
		 * Parent knows only its own method but the child knows the parent as well as its own  method.
		 * So a child object can access both the method of its parent as well as the method of the subclass/child class i.e itself.
		 * */
	}
}
