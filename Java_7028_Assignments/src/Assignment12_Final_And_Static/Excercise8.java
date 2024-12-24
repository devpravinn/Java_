package Assignment12_Final_And_Static;

final class FinalClassDemo{
	void show() {
		System.out.println("By kiran's way final class can not be inherited");
	}
}
public class Excercise8 extends FinalClassDemo {
	//Here compile time error will be thrown because final class cannot be extended
	
	public static void main(String [] args) {
		FinalClassDemo obj = new FinalClassDemo();
		obj.show();
	}
}
