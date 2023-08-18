package object;
class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}

 class Circle implements Cloneable {
	Point point;
	int radius;
	
	Circle (int x, int y , int radius){
		this.radius = radius;
		point = new Point(x,y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}

	 @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		Circle circle2 = circle;
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println();
		System.out.println(System.identityHashCode(circle)); 
		System.out.println(); // clone()사용하면 주소지 달라짐  : Circle copyCircle = (Circle)circle.clone();
		System.out.println(System.identityHashCode(copyCircle));
		System.out.println(); // 클론 없이 그냥 대입하면 주소지 같음  : Circle circle2 = circle;
		System.out.println(System.identityHashCode(circle2));
	}

}
