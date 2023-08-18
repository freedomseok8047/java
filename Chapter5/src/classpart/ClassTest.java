package classpart;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person man1 = new Person();
		man1.age = 40;
		man1.name = "James";
		man1.isMarried = true;
		man1.childNo = 3;	
		
		Person m2 = new Person();
		m2.setAge(27);
		m2.setName("Jun");
		m2.setMarried(false);
		m2.setChildNo(0);
		
		Person m3 = new Person(32, "Lee", false, 2);

		man1.showPersonInfo();
		System.out.println();
		m2.showPersonInfo();
		System.out.println();
		m3.showPersonInfo();
		System.out.println();
		
		Order o = new Order();
		o.setOrderId("201803120001");
		o.setId("adc123");
		o.setDate("2018년 3월 12일");
		o.setName("홍길순");
		o.setProductId("PD0345-12");
		o.setAddress("서울시 영등포구 여의도동 20번지");
		
		o.showOrderInfo();
		System.out.println();
		
		Order o2 = new Order("202308040002", "AAA777", "2023년 8월 4일", "이준석", "QW0002-77", "부산시 남구 대연동 수영로");
		o2.showOrderInfo();		
		System.out.println();
		
		
		Student3 s3 = new Student3();
		s3.setStudentID(1);
		s3.setStudentName("임꺽정");
		
		Subject kr= new Subject("국어" ,90);
		Subject ma= new Subject("수학" ,80);
		
		s3.setKroean(kr);
		s3.setMath(ma);
		
		s3.showStudent3Info();
		
	}
	
	}



























