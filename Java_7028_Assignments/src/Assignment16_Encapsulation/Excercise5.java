package Assignment16_Encapsulation;

class Encapsulate{
	//private variables declared
	//these can only be accessed by public methods of class
	
	private String Name;
	private int Roll;
	private int Age;
	
	//get method for age to access
	public int getAge() {
		return this.Age;
	}
	//set method for age - to set age variable
	public void setAge(int Age) {
		this.Age = Age;
	}
	
	//get method for roll number to access
	public int getRoll() {
		return this.Roll;
	}
	
	//set method for Roll - to set Roll variable
	public void setRoll(int Roll) {
		this.Roll = Roll;
	}
	
	//get method for Name to access
	public String getName() {
		return this.Name;
	}
	
	//set method for Name - to set Name variable
	public void setName(String Name) {
		this.Name = Name;
	}
	
}

public class Excercise5 {
	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		obj.setName("Pravin");
		obj.setRoll(239);
		obj.setAge(20);
		
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
		System.out.println("Roll No: "+obj.getRoll());
		
		//Direct access of Roll is not possible due to encapsulation
//		System.out.println("roll: "+obj.name);
	}
}
