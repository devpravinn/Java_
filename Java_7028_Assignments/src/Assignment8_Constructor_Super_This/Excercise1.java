package Assignment8_Constructor_Super_This;

public class Excercise1 {
	int value1;
	int value2;
	//Overloading constructors
	Excercise1(){
		value1 = 10;
		value2 = 20;
		System.out.println("Inside the first constructor");
	}
	
	Excercise1(int a){
		this.value1 = a;
		this.value2 = 20;
		System.out.println("Inside the second constructor");
	}
	Excercise1(int a, int b){
		this.value1 = a;
		this.value2 = b;
		System.out.println("Inside the third constructor");
	}
	public void display() {
		System.out.println("Value1=== "+value1);
		System.out.println("Value2=== "+value2);
	}
	public static void main(String[] args) {
		Excercise1 c1 = new Excercise1(); 
		Excercise1 c2 = new Excercise1(101);
		Excercise1 c3 = new Excercise1(99,100);
		c1.display();
		c2.display();
		c3.display();
	}
}
