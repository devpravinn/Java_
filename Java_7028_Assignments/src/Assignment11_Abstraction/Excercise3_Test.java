package Assignment11_Abstraction;

public class Excercise3_Test {
	public static void main(String[] args) {
		Excercise3_Child obj = new Excercise3_Child();
		obj.getName("Pravin");
		obj.getGender("Male");
		obj.getCity("Mumbai");
		obj.getCountry("India");
		
		obj.display();
	}
}
