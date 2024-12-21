package Assignment6_Access_Modifier;

public class TestExample1 {
	public static void main(String[] args) {
		Example1 obj = new Example1();
//		obj.m1()//not accessible as it is private 
		obj.m2();//accessible
		obj.m3();//accessible
		obj.m4();//accessible
		
	}
}
