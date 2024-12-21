package Assignment8_Constructor_Super_This;

public class Excercise4 {
	
	//WAP to assign the ID,Name,Age of Student using Constructor and through encapsulation
	//Encapsulation can be done by making all the fields as private and using getter and setter methods in order to access those private members
	//You can perform the logical checking in the getter and setter methods if required
	private int studentId;
	private String studentName;
	private int studentAge;
	
	Excercise4(){
		studentId = 100;
		studentName = "New Student";
		studentAge = 20;
	}
	Excercise4(int studentId, String studentName, int studentAge){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	//setters
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	//getters
	public String getStudentName() {
		return this.studentName;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public int getStudentAge() {
		return this.studentAge;
	}
	
	
	@Override
	public String toString() {
		return "Excercise4 [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ "]";
	}
	public static void main(String[] args) {
		Excercise4 Student1 = new Excercise4();
		System.out.println(Student1);
		System.out.println("Student ID is: "+Student1.getStudentId());
		System.out.println("Student Name is: "+Student1.getStudentName());
		System.out.println("Student Age is: "+Student1.getStudentAge());
		
		Excercise4 Student2 = new Excercise4(101,"Pravin Singh",21);
		System.out.println(Student2);
		System.out.println("Student ID is: "+Student2.getStudentId());
		System.out.println("Student Name is: "+Student2.getStudentName());
		System.out.println("Student Age is: "+Student2.getStudentAge());
	}
}
