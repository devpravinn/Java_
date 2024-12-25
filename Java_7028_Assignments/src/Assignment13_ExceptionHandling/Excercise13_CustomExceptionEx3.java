package Assignment13_ExceptionHandling;

public class Excercise13_CustomExceptionEx3 {
	public static void main(String [] args) throws Exception {
		Excercise13_CustomExceptionEx3 es = new Excercise13_CustomExceptionEx3();
		es.displayMymsg();
	}
	public void displayMymsg() throws Excercise13_CustomExceptionEx1 {
		for(int i = 8; i > 0; i--) {
			System.out.println("i = "+i);
			if(i == 7) {
				throw new Excercise13_CustomExceptionEx1("This is my own Custom Message"); 
			}
			
		}
	}
}
