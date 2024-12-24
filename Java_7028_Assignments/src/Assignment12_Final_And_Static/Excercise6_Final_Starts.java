package Assignment12_Final_And_Static;

public class Excercise6_Final_Starts {
	
	final int a = 10;
	
	final void JBK() {
		final int i = 0; //local variables can be final
		for(i = 0; i < 5; i++) {
			//Compile time error final variable's value can't be changed
			System.out.println("Value of I : "+i);
		}
	}
	
	public static void main(String[] args) {
		Excercise6_Final_Starts obj = new Excercise6_Final_Starts();
		obj.JBK();
	}
	
}
