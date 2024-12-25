package Assignment13_ExceptionHandling;

public class Excercise12_FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("The value: ");
			for(int i = 1;i <= 3; i++) {
				System.out.println(i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("The finally block always executes.");
		}
	}
}
