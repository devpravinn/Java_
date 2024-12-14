package Assignment2_Class_Method_Calling;

public class Area {
	//Example to demonstrate method arguments and sending parameters and receiving them in main method.
	double getArea(double x, double y ) {
		return x * y;
	}
	public static void main(String [] args) {
		Area area = new Area();
		double result = area.getArea(10.2, 23.4);
		System.out.println(result);
	}
}
