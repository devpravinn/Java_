package Assignment11_Abstraction;

public class Excercise7_Vehicle implements Excercise7_Interface_Moveable{
	public void move() {
		System.out.println("Average speed is: "+AVGSPEED);
	}
	public static void main(String[] args) {
		Excercise7_Vehicle obj = new Excercise7_Vehicle();
		obj.move();
	}
}
