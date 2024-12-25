package Assignment15_Strings;

public class Excercise2 {
	//WAP to reverse a string without any inbuilt method
	public static void main(String[] args) {
		String s = "Java By Kiran";
		String reversed = reverse(s);
		System.out.println("Reversed String is: "+reversed);
	}
	public static String reverse(String s) {
		String reversedString="";
		for(int i = s.length()-1;i >=0; i--) {
			reversedString+=s.charAt(i);
		}
		return reversedString;
	}
}
