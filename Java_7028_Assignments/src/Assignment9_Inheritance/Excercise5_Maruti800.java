package Assignment9_Inheritance;

//Performing multilevel inheritance inside a single class itself
class Car{
	public Car(){
		System.out.println("Constructor of the class Car");
	}
	public void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}
}
class Maruti extends Car{
	public Maruti() {
		System.out.println("Constructor of class Maruti");
	}
	public void brand() {
		System.out.println("Brand : Maruti");
	}
	public void speed() {
		System.out.println("Max speed: 90kmph");
	}
}
public class Excercise5_Maruti800 extends Maruti {
	public Excercise5_Maruti800() {
		System.out.println("Constructor of class Excercise5_Maruti800");
	}
	public void speed() {
		System.out.println("Max speed: 80kmph");
		
	}
	public static void main(String[] args) {
		Excercise5_Maruti800 obj = new Excercise5_Maruti800();
		obj.vehicleType();
		obj.brand();
		obj.speed();
	}
}
