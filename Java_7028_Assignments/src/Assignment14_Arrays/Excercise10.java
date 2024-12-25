package Assignment14_Arrays;

public class Excercise10 {
	public static void main(String[] args) {
		//Calculating the average of all the elements of the array
		double nums[] = {10.1,11.2,12.3,13.4,14.5}; //defining the double array
		double result = 0; //Result variable to store the sum of array of values
		
		int i;
		for(i = 0; i < 5; i++) {
			result=result+nums[i]; //addition of values
		}
		System.out.println("Average is: "+result/5);
	}
}
