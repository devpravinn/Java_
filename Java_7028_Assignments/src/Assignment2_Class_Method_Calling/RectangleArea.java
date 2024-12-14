package Assignment2_Class_Method_Calling;

public class RectangleArea {
	int length;
	int breadth;
	void Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public int getArea() {
		return length*breadth;
	}
	
}
