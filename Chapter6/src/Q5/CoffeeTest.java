package Q5;

public class CoffeeTest {

	public static void main(String[] args) {

		Customer kim = new Customer("Kim", "starAmericano" ,10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, 4000);
		kim.buyBeanCoffee(beanCoffee, 4500);

	}
}
