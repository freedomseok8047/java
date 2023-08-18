package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int bmoney;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.bmoney += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 "+ busNumber + "번의 승객은 " + passengerCount 
				+ "명이고, 수입은 "+ bmoney + "입니다.");
	}
}
