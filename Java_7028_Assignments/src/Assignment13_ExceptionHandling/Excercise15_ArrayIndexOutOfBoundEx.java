package Assignment13_ExceptionHandling;

public class Excercise15_ArrayIndexOutOfBoundEx {
	public static void main(String[] args) {
		try {
			int [] arr = new int[10];
			//Array has only 10 elements
			arr[11] = 9;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception");
		}
	}
}
