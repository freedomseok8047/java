package Array;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student( "James");
		students[1] = new Student( "Tomas");
		students[2] = new Student( "Edward");
	
		Student student1 = new Student(Student.getSerialNum(), "James");
		Student student2 = new Student(Student.getSerialNum(), "Tomas");
		Student student3 = new Student(Student.getSerialNum(), "Edward");
		
		for ( int i = 0; i <students.length; i++ ) {
			students[i].showStudentInfo();
		}
	}

}
