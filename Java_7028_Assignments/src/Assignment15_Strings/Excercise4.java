package Assignment15_Strings;

public class Excercise4 {
	//WAP to remove specific character from string in java.
	public static void main(String[] args) {
		String s = "Java By Kiran";
		String r[] = s.split("y|i|J|a|K"); //Whatever you pass here the output won't contain those characters
		String res="";
		for(String m: r) {
			res = res+m;
		}
		System.out.println(res);
	}
}
