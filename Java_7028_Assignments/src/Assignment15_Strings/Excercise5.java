package Assignment15_Strings;

public class Excercise5 {
	//Declare String Object
	public static void main(String[] args) {
		String str = new String("10");
		
		/*Using parseInt method of Integer class to convert String to integer primitive data type. This is a static method. Please note that method can throw a NumberFormatException if the string is not parsable to int
		 * */
		int i = Integer.parseInt(str);
		System.out.println(i);
	}
}
