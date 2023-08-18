package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		
		
		Bus bus100 = new Bus(100);
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfo();
		
		Bus bus200 = new Bus(200);
		James.takeBus(bus200);
		James.showInfo();
		bus200.showInfo();
		
		Subway Green = new Subway("Green");
		Tomas.takeSubway(Green);
		Tomas.showInfo();
		Green.showInfo();
		
	}

}
