package classpart;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if(month ==2) {
			if (day<1 || day > 28) {
				System.out.println("오류입니다.");			
			}else {
				this.day =day;
			}
		}
	}
	
	public void setMonth(int month) {
		if(month < 1 || month >12) {
				System.out.println("1~12 사이이의 값을 입력해주세요.");			
		}else {
			this.month = month;
		}
	}
	
}
