package Assignment8_Constructor_Super_This;

public class Excercise9Overloading {
	//Demonstrating constructor overloading
	private int rollNo;
	Excercise9Overloading(){
		rollNo = 100;
	}
	Excercise9Overloading(int num){
		this();
//		this() is used for calling the default constructor from
//		parameterized constructor. It should always be the first
//		statement in constructor body.
		this.rollNo = rollNo+num;
	}
	public int getRollNumber() {
		return this.rollNo;
	}
	public void setRollNumber(int rollNo) {
		this.rollNo = rollNo;
	}
}
