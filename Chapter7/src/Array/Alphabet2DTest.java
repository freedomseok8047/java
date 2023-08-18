package Array;

public class Alphabet2DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] alphabet2D = new char[13][2];
		char ch = 'a';
		
		for(int i = 0; i < alphabet2D.length; i++) {
			for(int j = 0; j< alphabet2D[i].length; j++) {
				alphabet2D[i][j] = ch++;
				System.out.print(alphabet2D[i][j] + " ");
			}
		System.out.println( );
		}
		
	}

}
