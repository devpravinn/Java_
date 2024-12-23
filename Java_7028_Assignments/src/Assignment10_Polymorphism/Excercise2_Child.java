package Assignment10_Polymorphism;

public class Excercise2_Child {
	public static void main(String[] args) {
		Excercise2_Parent obj = new Excercise2_Parent();
		double result;
		int add;
		obj.demo(10);
		obj.demo(10,20);
		result = obj.demo(5.5);
		System.out.println("O/P: "+result);
		add = obj.demo(5, 5, 5);
		System.out.println("O/P: "+add);
	}
}
