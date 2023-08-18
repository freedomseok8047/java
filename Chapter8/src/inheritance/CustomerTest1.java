package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer customerLee = new Customer();
			customerLee.setCustomerID(10010);
			customerLee.setCustomerName("이순신");
			customerLee.bonusPoint = 1000;
			System.out.println(customerLee.showCustomerInfo());
			
			System.out.println();
			
			VIPcustomer customerKim = new VIPcustomer();
			customerKim.setCustomerID(10020);
			customerKim.setCustomerName("김유신");
			customerKim.bonusPoint = 10000;
			customerKim.setAgentID(201);
			System.out.println(customerKim.showCustomerInfo());
			System.out.println("전담 에이전트 번호는 " + customerKim.getAgentID() + "입니다.");

	}

}
