package Assignment12_Final_And_Static;

public class Excercise5_Test {
	public static void main(String[] args) {
		Excercise5 obj1 = new Excercise5();
		obj1.showData();
		Excercise5 obj2 = new Excercise5();
		obj2.showData();
		obj2.b++;
		obj1.showData();
	}
}
