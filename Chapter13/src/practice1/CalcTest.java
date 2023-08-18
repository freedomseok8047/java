package practice1;

public class CalcTest {
	
	public static void main(String[] args) {
		Calc calc = (num1, num2) -> (num1 + num2);
		System.out.println(calc.add(20,20));
	}
}
