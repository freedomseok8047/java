package chapter2;

public class continueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total =0 ; 
		int num;
		 for (num = 1; num<=100; num++) {
			 if(num%2 ==1) {
				 continue;  //홀수면 바로 증감식으로 건너 뜀
			 }
			 total += num;
		 }
	System.out.println("1부터 100까지의 짝수의 합은: " + total + "입니다.");
	}
	}
