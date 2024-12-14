package Assignment2_Class_Method_Calling;

public class RectangleAreaTest {
	public static void main(String[] args) {
		RectangleArea obj = new RectangleArea();
		obj.Rectangle(6,7);
		int area = obj.getArea();
		System.out.println(area);
	}
}
