package Assignment11_Abstraction;

public class Excercise8_Tyre implements Excercise8_MovableEx2, Excercise8_Rollable {
	
	int width;
	
	public boolean isMoveable() {
		return true;
	}
	
	public boolean isRollable() {
		return true;
	}
	
	public static void main(String[] args) {
		Excercise8_Tyre tr = new Excercise8_Tyre();
		System.out.println(tr.isMoveable());
		System.out.println(tr.isRollable());
	}
}
