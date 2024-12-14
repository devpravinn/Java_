package Assignment2_Class_Method_Calling.Homework;

public class Score {
	String getResult(int marks) {
		if(marks>=60) {
			return "First Division";
		}
		else if(marks >= 50 && marks <= 59) {
			return "Second Divison";
		}
		else if(marks>=40 && marks <= 49) {
			return "Third Division";
		}
		else if(marks < 40) {
			return "Fail";
		}
		else {
			return "Invalid Marks";
		}
	}
	
	public static void main(String[] args) {
		Score obj = new Score();
		System.out.println(obj.getResult(60));
		System.out.println(obj.getResult(50));
		System.out.println(obj.getResult(40));
		System.out.println(obj.getResult(30));
	}
}
