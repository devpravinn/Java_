package Assignment15_Strings;

public class Excercise3 {
	//How to convert the string to an integer without using any direct method
	public static void main(String[] args) {
		String s = "88881";
//		int num = Integer.parseInt(s);
		int num = convertToInteger(s);
		System.out.println(num);
	}
	public static int convertToInteger(String s) {
		int a = 0;
		int num = 0;
		boolean isNegative = false;
		
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)=='-') {
				isNegative = true;
				continue;
			}
			a = s.charAt(i) - 48;
			num = num*10+a;
		}
		if(isNegative) {
			return num*(-1);
		}
		return num;
	}
}
