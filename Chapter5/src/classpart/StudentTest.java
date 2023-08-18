package classpart;

public class StudentTest {

	
		public static void main(String [] args) {
			Student studentAhn = new Student();
			Student a = new Student();
			
			a.studentName = "홍길동";
			studentAhn.studentName ="안현수";
			studentAhn.setStudentName("안현수");
			
			System.out.println(studentAhn.studentName); //두개 같은기능 다르게 구현 
			System.out.println(a.studentName);
			
			System.out.println(studentAhn.getStudentName());
			System.out.println(a.getStudentName());
			
			studentAhn.showStudentInfo();
		}
	}


