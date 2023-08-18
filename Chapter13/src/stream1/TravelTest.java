package stream1;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신",40, 10000);
		TravelCustomer customerKim = new TravelCustomer("김유신",25, 20000);
		TravelCustomer customerHong = new TravelCustomer("홍길동",17, 50000);
		
		ArrayList<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== 고객 명단에 추가된 순서대로 출력 == ");
		customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행비용은 " + total + "원 입니다.");
		
		System.out.println("==20세 이상 고객 명단 정렬하여 출력==");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
	}

}
