package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("Java");
		System.out.println(javaStr);
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr); 
		// 문자열 조합을 많이하는 프로그램일 경우 + 로 연결하는것보다 효율적이다. 메모리를 절약가능하다.
		// StringBilder나 Buffer 사용 권장
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		javaStr = buffer.toString(); // 문자열 주소 갱신
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		
	}

}
