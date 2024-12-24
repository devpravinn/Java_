package Assignment12_Final_And_Static;

public class Excercise2 {
	
	public static void copyVariables(String str1, String str2) {
		//copies argument 2 to argument 1
		str2 = str1;
		System.out.println("First String arg is: "+str1);
		System.out.println("Second String arg is: "+str2);
	}
	
	public static void main(String[] args) {
		//this is the first method to call static method
		Excercise2.copyVariables("PQR", "DEF");
		
		//this is the second method to call static method
		copyVariables("XYZ","ABC"); //recommended
		
		//this is the third method to call static method
		//create the instance and then use it to call the method
		Excercise2 obj = new Excercise2();
		obj.copyVariables("JKL", "MNO"); //not recommended though
	}
}
