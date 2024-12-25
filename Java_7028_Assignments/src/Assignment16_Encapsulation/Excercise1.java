package Assignment16_Encapsulation;

class Area {
	// fields to calculate area
	int length;
	int breadth;

	// constructor to initialize values
	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// method to calculate the area
	public void getArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}
}

public class Excercise1 {

	public static void main(String[] args) {
//		Create object of Area
//		Pass the value of length and breadth
		Area rectangle = new Area(10,20);
		rectangle.getArea();
	}
}
