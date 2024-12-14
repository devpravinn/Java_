package Assignment2_Class_Method_Calling.Homework;

public class CompoundInterest {
	double getCompoundInterest(double principalAmount, double rateOfInterest,int timePeriod) {
		double result = (principalAmount*Math.pow((1+(rateOfInterest/100.0)), timePeriod)) - principalAmount;
		return result;
	}
	public static void main(String[] args) {
		CompoundInterest CI = new CompoundInterest();
		System.out.println(CI.getCompoundInterest(50000, 10, 5));
	}
}
