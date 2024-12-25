package Assignment14_Arrays;

import java.util.Arrays;

public class Excercise8 {
	//Program to merge two arrays
	public static void main(String[] args) {
		int [] values1 = {10,20,30};
		int [] values2 = {40,50,60};
		int [] merge = new int[values1.length + values2.length];
		for(int i = 0; i < values1.length;i++) {
			merge[i] = values1[i];
		}
		for(int i = 0; i < values2.length;i++) {
			merge[i+values2.length] = values2[i];
			//for first iteration merge[0+3] = values2[0] 
			//for the next iterations it will go on incrementing i
		}
		
		//Displaying the merged array
		for(int i = 0; i < merge.length;i++) {
			System.out.println(merge[i]);
		}
		
		//Another method to display the array without using for loop: Arrays.toString()
		System.out.println(Arrays.toString(merge));
	}
}
