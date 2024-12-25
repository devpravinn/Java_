package Assignment16_Encapsulation;

class EncapsulationDemo{
	private int ssn;
	private String empName;
	private int empAge;
	
	//getters and setters
	public int getSsn() {
		return ssn;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "EncapsulationDemo [ssn=" + ssn + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
}

public class Excercise4_EncapsulationTest {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName("Pravin");
		obj.setEmpAge(20);
		obj.setSsn(112233);
		System.out.println(obj);
	}
}
