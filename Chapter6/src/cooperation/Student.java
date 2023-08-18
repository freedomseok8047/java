package cooperation;

public class Student {
	public String studentName;
	public int studentMoney;
	
	Student (String studentName,int money) {
		this.studentName = studentName;
		this.studentMoney = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.studentMoney -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.studentMoney -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은돈은" + studentMoney + "입니다.");
	}
	
}
