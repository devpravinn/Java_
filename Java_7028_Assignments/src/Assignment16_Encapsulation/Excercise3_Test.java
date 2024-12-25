package Assignment16_Encapsulation;

public class Excercise3_Test {
	public static void main(String[] args) {
		//Creating instance of encapsulated class
		Excercise3_Student s1 = new Excercise3_Student();
		
		//setting the value in the name member
		s1.setName("Pravin");
		
		//getting the value of the name member
		System.out.println(s1.getName());
	}
}
