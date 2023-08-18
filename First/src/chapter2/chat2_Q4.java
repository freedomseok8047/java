package chapter2;

public class chat2_Q4 {
	
	public static void main(String[] args) {
		int count = 3;
		for (int i = 4; i<=7; i++) {
			for (int j=1; j<=i; j++) {
			
			if (j<=count) {
				System.out.print(" ");
			}else {
				System.out.print('*');
			}
			}
		count--;
		System.out.println("");

		}
	}
}
