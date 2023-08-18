package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int smoney;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;	
	}
	
	public void take(int money) {
		this.smoney += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount
				+ "명이고, 수입은 " + smoney + "입니다.");
	}

}
