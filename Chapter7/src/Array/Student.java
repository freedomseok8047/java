package Array;

public class Student {
	private int studentId;
	private String name;
	private static int serialNum = 1000;
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//public Student() {}
	public Student(String name) {
		serialNum++;
		studentId = serialNum;
		this.name = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}


	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public void showStudentInfo() {
		System.out.println(studentId + " , " + name);
	}
}
