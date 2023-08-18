package chapter2;

public class chap2_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단보다 곱하는수가 작거나 같은경우만");
		int i = 0;
		int j = 0;
		int result = 0;
		
		for (i = 1; i<=9; i++) {
			for (j=1; j<=9; j++) {
				if (i<j) {
					break;
				}
				result = i * j ;
				System.out.println(i + " X " + j + " = " + result );
			}
		}
		
	}

}
