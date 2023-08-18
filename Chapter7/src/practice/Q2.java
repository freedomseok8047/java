package practice;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] lowerCase = new char[26];
		char ch = 'a';
		
		for(int i = 0 ; i < lowerCase.length; i++) {
			lowerCase[i] = ch++;
		}
		
		for(int i = 0; i < lowerCase.length; i++){
			System.out.println(lowerCase[i] + " , " + (int)lowerCase[i]);
		}
		
	}

}
