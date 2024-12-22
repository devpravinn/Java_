package Assignment9_Inheritance;

public class Excercise2_Child extends Excercise2_Parent {
	String modelType;
	
	public void showDetail() {
		vehicleType = "Car";
		modelType = "Sports";
		System.out.println(modelType+" "+vehicleType);
	}
	public static void main(String[] args) {
		Excercise2_Child obj = new Excercise2_Child();
		obj.showDetail();
	}
}
