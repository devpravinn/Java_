package Assignment9_Inheritance;
//Multilevel inheritance
class User{
	String name;
	int age;
	long ph;
}
class Employee extends User{
	String specialization;
}
class Manager extends User{
	String department;
}
public class Excercise6 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Pravin";
		e1.age = 21;
		e1.ph = 123456789;
		e1.specialization = "Java";
		
		Manager m1 = new Manager();
		m1.name="Sanjay";
		m1.age = 25;
		m1.ph = 123123456;
		m1.department="HR";
		
		//Printing the employee details
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.ph);
		System.out.println(e1.specialization);
		
		//Printing the manager details
		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.ph);
		System.out.println(m1.department);
	}
}
