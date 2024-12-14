package Assignment2_Class_Method_Calling.Homework;

public class Excercise1 {
	//WAP to calculate cube, input will be sent through method arguments.
	int getCube(int num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		Excercise1 obj = new Excercise1();
		System.out.println(obj.getCube(4));
	}
}
