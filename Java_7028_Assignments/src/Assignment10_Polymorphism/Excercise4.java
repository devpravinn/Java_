package Assignment10_Polymorphism;

public class Excercise4 {
	String name;
	int age;
	String email;
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setData(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}
	
	public static void main(String[] args) {
		Excercise4 student1 = new Excercise4();
		student1.setData("Pravin", 21,"pravin130204@gmail.com" );
		Excercise4 student2 = new Excercise4();
		student2.setData("Harry", 21);
		student1.display();
		student2.display();
	}
}
