package Assignment14_Arrays;

public class Excercise9 {
	//Program for the addition of two 2-dimensional array(matrix).
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{1,2,3},{4,5,6}};
		
		int c[][] = new int [a.length][a[0].length];
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j < a[i].length;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		
		//Displaying the resultant matrix
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length;j++) {
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
