package classpart;

public class Student3 {
	int studentID;
	String studentName;
	Subject Korean;
	Subject math;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subject getKroean() {
		return Korean;
	}
	public void setKroean(Subject kroean) {
		Korean = kroean;
	}
	public Subject getMath() {
		return math;
	}
	public void setMath(Subject math) {
		this.math = math;
	}
	public void showStudent3Info() {
		System.out.println(studentID);
		System.out.println(studentName);
		System.out.println(Korean.subjectName);
		System.out.println(Korean.scorePoint);
		System.out.println(math.subjectName);
		System.out.println(math.scorePoint);
		
	}
	
	
}
