package Assignment16_Encapsulation;

class Person{
	//for encapsulating properly
	//1.Make all the fields(global variables) private
	//2.Make getters and setters to get and set the value of those fields from outside the class when required.
	//3.Write all the validation logic in the setters before setting the value of those fields
	
	//private fields
	private int age;
	
	//getter method
	public int getAge() {
		return this.age;
	}
	
	//setter method
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("Age can't be less than 0");
		}
		else {
			this.age = age;
		}
	}
}

public class Excercise2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(24);
		System.out.println("My age is: "+p1.getAge());
	}
}
