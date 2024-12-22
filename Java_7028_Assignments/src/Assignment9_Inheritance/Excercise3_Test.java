package Assignment9_Inheritance;

public class Excercise3_Test {
	public static void main(String[] args) {
		Excercise3_Car car1 = new Excercise3_Car();
		car1.color = "red"; //own or child class (Excercise3_Car)
		car1.setSpeed(200); //own or child class (Excercise3_Car)
		car1.setSize(22);   //own or child class (Excercise3_Car)
		car1.CC = 1000;     //from the parent class (Excercise3_Vehicle) 
		car1.gears  =5;     //from the parent class (Excercise3_Vehicle)
		
		System.out.println("Color of car: "+car1.getColor());
		System.out.println("Speed of car: "+car1.getSpeed());
		System.out.println("Size of car: "+car1.getSize());
		System.out.println("CC of car: "+car1.CC);
		System.out.println("No of gears of Car: "+car1.gears);
	}
}
