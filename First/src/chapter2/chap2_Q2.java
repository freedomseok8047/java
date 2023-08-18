package chapter2;

public class chap2_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단을 짝수만 출력합니다.");
		int i = 0;
		int j = 0;
		int result = 0;
		
		for (i = 1; i<=9; i++) {
			for (j=1; j<=9; j++) {
				if (i%2 == 1) {
					continue;
				}
				result = i * j ;
				System.out.println(i + " X " + j + " = " + result );
			}
		}
		
		for ( i = 2 ; i <= 9 ; i+=2 ) {
			for (j=1; j<=9; j++) {
				result = i * j ;
				System.out.println(i + " X " + j + " = " + result );
			}
		}
	}
	

}
