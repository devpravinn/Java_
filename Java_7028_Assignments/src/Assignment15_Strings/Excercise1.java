package Assignment15_Strings;

public class Excercise1 {
//	How can you determine if the string has all unique characters
	public static void main(String[] args) {
		String s = "A B C D E";
		System.out.println(isAllUnique(s));
	}
	public static boolean isAllUnique(String s) {
		for(int i = 0; i < s.length();i++) {
			for(int j = i+1; j < s.length();j++) {
				//if you want to skip space then add a check in the below if condition
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
