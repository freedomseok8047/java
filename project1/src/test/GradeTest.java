package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class GradeTest {
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	String subjectFirstSpell;
	String subjectName;
	int subjectId;

	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) throws IOException  {

		GradeTest test = new GradeTest();

		test.createSubject2();
		test.createStudent();

		String report = test.gradeReport.getReport();
		System.out.println(report);
		try(FileOutputStream fos = new FileOutputStream("resultInfo.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write(report);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createSubject2() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream("subjectInfo.txt"));

		while (scanner.hasNextLine()) {
			subjectFirstSpell = scanner.next();
			subjectName = scanner.next();
			subjectId = scanner.nextInt();
		
			if(subjectFirstSpell.equals("K")) {
				korean = new Subject("국어", Define.KOREAN);
				goodSchool.addSubject(korean);
			}else if(subjectFirstSpell.equals("M")) {
				math = new Subject("수학", Define.MATH);
				goodSchool.addSubject(math);
			}else if (subjectFirstSpell.equals("D")) {
				dance = new Subject("방송댄스", Define.DANCE);
				goodSchool.addSubject(dance);
				dance.setGradeType(Define.PF_TYPE);
			}
				
			
		}
	}

	public void createStudent() throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner (new FileInputStream("studentInfo.txt"));
		String name;
		int id;
		int koreanScore;
		int mathScore;
		Integer danceScore;
		int majorCode;
		
		Student student = null;
		while (scanner.hasNextLine()) {
			name = scanner.next();
			id = scanner.nextInt();
			koreanScore = scanner.nextInt();
			mathScore = scanner.nextInt();
			danceScore = scanner.nextInt();
			if (danceScore.toString().length() == 4) {
				majorCode = danceScore;
		   }else {
				majorCode = scanner.nextInt();
		   }
			
			if (majorCode == Define.KOREAN) {
				student = new Student(id, name, korean);
				
			}else if (majorCode == Define.MATH) {
				student = new Student(id, name, math);
				
			}else {
				student = new Student(id, name, dance);
				
			}
		
			goodSchool.addStudent(student);
			korean.register(student);
			math.register(student);
			addScoreForStudent(student, korean , koreanScore );
			addScoreForStudent(student, math , mathScore );
			if(danceScore.toString().length() != 4) {
				dance.register(student);
				addScoreForStudent(student, dance , danceScore );
			}
			
			
			
				
		}
	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}

}
