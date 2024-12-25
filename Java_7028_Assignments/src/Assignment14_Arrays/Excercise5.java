package Assignment14_Arrays;

public class Excercise5 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		if(arr1==arr2) { //Same as arr1.equals(arr2)
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
	}
}
/*
 * Note: == & .equals() of object class : checks the values and the references if they point to the same object or not
 * In our case the values of both the arrays are same but not the addresses.
 * */
