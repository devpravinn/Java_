package Assignment14_Arrays;

import java.util.Arrays;

public class Excercise14 {
//	Program for copying an array to another
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5,6};
		int [] array2 = new int [6];
		int [] array3 = new int [6];
		System.out.print("array1: ");
		System.out.print("[");
		for(int i = 0; i < array1.length;i++) {
			System.out.print(" "+array1[i]);
		}
		System.out.println("]");
		
		System.out.print("\narray2: ");
		System.out.print("[");
		for(int i = 0; i < array1.length;i++) {
			array2[i] = array1[i];
			System.out.print(" "+array2[i]);
		}
		System.out.print("]");
		
		System.out.println();
		//Using System.copyArray
		System.out.println("Copying array using System.arraycopy method: ");
		System.arraycopy(array1,0,array3,0,6);
		System.out.println(Arrays.toString(array3));
		
	}
}
