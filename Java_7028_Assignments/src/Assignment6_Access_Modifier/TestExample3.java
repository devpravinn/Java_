package Assignment6_Access_Modifier;

public class TestExample3 {
	public static void main(String[] args) {
		Example3 obj = new Example3();
		System.out.println(obj.data);//can't access it because the "data" variable is with private access modifier
		System.out.println(obj.data1);//No error as its with "default" access modifier and is being currently used inside of the same package.
		obj.msg(); //this member is also private -- compiler shows errors while writing code itself so compile time error
	}
}
