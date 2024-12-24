package Assignment12_Final_And_Static;

class FinalEx {
	
	FinalEx(){
		System.out.println("This is a default constructor of FinalEx class");
	}
	
	final int a = 100;
	
//	We cannot override the below method
	final void show() {
		System.out.println(a);
	}
	
	//But we can override a final method
	void show(int a) {
		
	}
	
	void welcome() {
		System.out.println("Welcome to java by kiran, Pune");
	}

}
public class Excercise7 extends FinalEx{
	
	//Compile time error because we cannot override
	void show() {
		System.out.println("This is method of FinalExTest");
	}
	
	public static void main(String[] args) {
		FinalEx obj = new FinalEx();
		obj.show();
	}
}
