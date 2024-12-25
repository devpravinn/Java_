package Assignment14_Arrays.Homework;

public class Excercise3 {
	public static void main(String[] args) {
		//Program to find the sum of odd and even numbers in the array
		int [] arr = {1,2,3,4,5};
		int sumOdd = findSum(arr,false);
		int sumEven = findSum(arr,true);
		System.out.println("Sum of odd numbers in array: "+sumOdd);
		System.out.println("Sum of even numbers in array: "+sumEven);
	}
	public static int findSum(int [] arr, boolean isEven) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isEven && arr[i]%2==0) {
				sum+=arr[i];
			}
			if(!isEven && arr[i]%2!=0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
}
