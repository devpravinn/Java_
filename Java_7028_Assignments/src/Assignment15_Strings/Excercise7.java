package Assignment15_Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excercise7 {
	
	public static void main(String[] args) throws Exception{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String name="";
		//below condition in the while loop checks whether the input is equals to stop or not
		while(!name.equals("stop")) {
			System.out.println("Enter Input: ");
			name = br.readLine();
			System.out.println("Input is:"+name);
		}
	}
}
