package Assignment14_Arrays;

import java.util.Arrays;

public class Excercise15 {
	//Program to sort an integer array
	public static void main(String[] args) {
		int [] arr = {5,4,3,2,1};
		//For sorting you can also use Arrays.sort() and it will also give you a sorted output
		//Arrays.sort(arr);
		bubbleSort(arr); //using my own method
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void bubbleSort(int [] arr) {
		boolean isSwapped = false;
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j <arr.length-i-1;j++) {
				if(arr[j]> arr[j+1]) {
					swap(arr,j,j+1);
					isSwapped = true;
				}
			}
			if(!isSwapped) break;
		}
	}
	public static void swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
