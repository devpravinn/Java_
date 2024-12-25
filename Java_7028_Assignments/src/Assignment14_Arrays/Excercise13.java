package Assignment14_Arrays;

public class Excercise13 {
	//Program to create 3-dimensional array
	public static void main(String[] args) {
		//Create space cube with 9 points
		byte [][][] space = new byte[3][3][3];
		space[0][0][0] = 10; 
		space[1][1][1] = 20; //middle of the cube
		space[2][2][2] = 30;
		
		//Display points in our space-cube.
		System.out.println(space[0][0][0]);
		System.out.println(space[1][1][1]);
		System.out.println(space[2][2][2]);
	}
}
