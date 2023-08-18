package object;

class MyDate {
	int day;
	int month;
	int year;
	
public MyDate(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
 }

@Override
public boolean equals(Object obj) {
	if(obj instanceof MyDate) {
		MyDate md = (MyDate)obj;
		if(this.day == md.day && this.month == md.month
				&& this.year == md.year) {
			return true;
		}else return false;
	}
	return false;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return Integer.parseInt("" + this.day + this.month + this.year);
}

}

public class MyDateTest{
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		MyDate date3 = new MyDate(10,19,2004);
		System.out.println(date1 == date2); // 주소다름 false
		System.out.println(date1.equals(date2)); // 내용 같음 true
		System.out.println(date1.equals(date3)); // 내용 다름 false
		System.out.println();
		System.out.println(date1.hashCode());
		
	}



}
