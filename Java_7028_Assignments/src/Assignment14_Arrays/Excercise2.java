package Assignment14_Arrays;

public class Excercise2 {
	public static void main(String[] args) {
		//Creating the array, assigning and fetching values
		int [] array = new int[5];
		//Assign first three elements.
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		//Loop over the elements.
		for(int i = 0; i < array.length;i++) {
			//Get value.
			int value = array[i];
			//Print value.
			System.out.println(value);
		}
	}
}
