package Assignment14_Arrays.Homework;

public class Excercise1 {
	//Find the highest number in the array
	public static void main(String[] args) {
		int [] arr = {1,99,43,32,-1,68};
		int max = findMax(arr);
		System.out.println("Max value from the array is: "+max);
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
