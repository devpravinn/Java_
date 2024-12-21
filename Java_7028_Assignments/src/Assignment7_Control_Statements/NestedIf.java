package Assignment7_Control_Statements;

public class NestedIf {
	public static void main(String[] args) {
		//WAP to demonstrate nested-if
		int x = 10;
		int y = 11;
		if(x==10) {
			if(y==10) {
				System.out.println("Both variables are equal");
			} else {
				System.out.println("Both are not equal");
			}
		}
	}
}
