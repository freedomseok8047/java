package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		//CarFactory factory = new CarFactory(); 
		// private 때문에 이렇게 선언불가
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
		factory.setCarNum(20000);
		mySonata = factory.createCar();
		yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
	}

}
