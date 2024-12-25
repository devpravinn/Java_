package Assignment14_Arrays;

public class Excercise3 {
//	Java program that uses character array and loops
	public static void main(String[] args) {
		//Create an array of four characters(char).
		char c[] = new char[4];
		c[0] = 'j';
		c[1] = 'a';
		c[2] = 'v';
		c[3] = 'a';
		
//		Looping over the array with for-loop(for-each loop).
		for(char value: c) {
			System.out.println(value);
		}
	}
}
