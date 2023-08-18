package Q5;

public class Customer {

	private String name;
	private String menu;
	private int money;
	
	Customer(String name, String menu ,int money ){
		this.name = name;
		this.menu = menu;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "   " + money +"  "  + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "   " + money +"  "  + message);
		}
	}
}
