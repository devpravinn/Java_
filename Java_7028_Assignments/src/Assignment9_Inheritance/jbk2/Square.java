package Assignment9_Inheritance.jbk2;
import Assignment9_Inheritance.jbk1.Shape;
public class Square extends Shape {
	public Square(int nSides) {
		sides = nSides; //possible
		//don't need to call super class
		//constructor due to protected type of variable.
	}
	void display() {
		Shape shape = new Shape();
//		System.out.println(shape.sides); //error as we are not
		//calling through object of subclass
	}
}
