package chapter2;


public class chap2_Q1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2; 
		char op = '/';
		if (op == '+') {
			System.out.println(num1 + num2);	
		}else if (op == '-') {
			System.out.println(num1 - num2);	
		}else if (op == '*') {
			System.out.println(num1 * num2);	
		}else if (op == '/') {
			System.out.println(num1 / num2);	
		}
		switch (op) { 
		 case '+' :
			 System.out.println(num1 + num2);
			 break;
		 case '-' :
			 System.out.println(num1 - num2);
			 break;
		 case '*' :
			 System.out.println(num1 * num2);
			 break;
		 case '/' :
			 System.out.println(num1 / num2);
			 break;
	
		}
	}
}
