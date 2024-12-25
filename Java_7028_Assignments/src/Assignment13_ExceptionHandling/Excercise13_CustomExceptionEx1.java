package Assignment13_ExceptionHandling;

public class Excercise13_CustomExceptionEx1 extends Exception {
	//As compared to previous examples here I am not making any call like super(String string) instead I am overriding the string method itself.
	String str1;
	
	Excercise13_CustomExceptionEx1(String str2){
		str1 = str2;
	}
	
	@Override
	public String toString() {
		return ("Output String = "+str1);
	}
}
