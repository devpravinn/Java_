package Assignment14_Arrays.Homework;

public class Excercise2 {
	//Find the second largest number in the array
	public static void main(String[] args) {
		int [] arr = {1,3,45,44,-18,2};
		int largest = findMax(arr);
		System.out.println(largest);
		int secondLargest = findSecondLargest(arr,largest);
		System.out.println("Second Largest Element From Array: "+secondLargest);
	}
	public static int findSecondLargest(int [] arr,int largest) {
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++) {	
			if(secondLargest < arr[i] && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	public static int findMax(int [] arr) {
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
}
