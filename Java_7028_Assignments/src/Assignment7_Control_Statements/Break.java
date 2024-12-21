package Assignment7_Control_Statements;

public class Break {
	public static void main(String[] args) {
		//WAP to break the loop 
		for(int i = 1; i < 10; i++) {
			if(i==8) 
				break;
			System.out.println(i);
		}
	}
}
