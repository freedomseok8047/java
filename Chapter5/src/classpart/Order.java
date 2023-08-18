package classpart;

public class Order {
	String orderId;
	String Id;
	String date ;
	String name ;
	String productId ;
	String address ;
	
	public Order() {}
	
	public Order(String orderId, String Id, String date, String name, String productId, String address) {
				this.orderId = orderId;
				this.Id = Id;
				this.date = date;
				this.name = name;
				this.productId = productId;
				this.address = address;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	} 
	public void showOrderInfo() {
		System.out.println("주문 번호 : " + orderId);
		System.out.println("주문자 아이디 : " + Id);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문자 이름 : " + name);
		System.out.println("상품 번호 : " + productId);
		System.out.println("배송지 : " + address);
	
	}	
}
