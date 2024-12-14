package Assignment2_Class_Method_Calling.Homework;

public class SimpleInterest {
	float getSimpleInterest(int PrincipalAmount, float RateOfInterest, int Time){
		return (PrincipalAmount*RateOfInterest*Time)/100;
	}
	public static void main(String[] args) {
		SimpleInterest SI = new SimpleInterest();
		System.out.println(SI.getSimpleInterest(5000, 7.78f, 5));
	}
}
