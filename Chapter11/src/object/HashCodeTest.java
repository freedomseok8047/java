package object;

public class HashCodeTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //주소는 다르고
		System.out.println(str1.equals(str2));   // 내용은 같다.
		System.out.println();
		System.out.println(str1.hashCode());
		System.out.println(str1);
		System.out.println();
		System.out.println(str2.hashCode());
		System.out.println(str2);
		System.out.println();
		
		
		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		// String과 Integer는 equals() 매서드가 내용을 비교하는 것으로 default로 Override 되어있다. 
		System.out.println();
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
	}

}
