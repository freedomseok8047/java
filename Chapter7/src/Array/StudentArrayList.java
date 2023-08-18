package Array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add( new Student( "James"));
		studentList.add( new Student( "Tomas"));
		studentList.add( new Student( "Edward"));
	
		Student student1 = new Student(Student.getSerialNum(), "James");
		Student student2 = new Student(Student.getSerialNum(), "Tomas");
		Student student3 = new Student(Student.getSerialNum(), "Edward");
		
		for ( Student student : studentList ) {
			System.out.println("향상된 for문");
			System.out.println(student.getStudentId() + "," + student.getName());
		}
	}

}
