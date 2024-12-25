package Assignment14_Arrays;

public class Excercise7 {
	public static void main(String[] args) {
		boolean [] values = {false,true,true,true};
		//Loop over the array elements in the reverse order.
		for(int i = values.length-1; i >= 0; i--) {
			System.out.println(values[i]);
		}
	}
}
