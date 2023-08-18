package chapter2;
import java.util.Scanner;

public class chap2_Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("출력할 별 갯수 입력하세요(홀수) : ");
		 int maxStars = scanner.nextInt();
		         // 홀수 개의 별로 이루어진 패턴을 출력하기 위해 maxStars를 2로 나눈 몫과 나머지 계산
        //5
		 int halfStars = maxStars / 2; // 2  
		 int oddStars = maxStars % 2;  // 1

        // 행 반복문
        for (int i = 1; i <= halfStars + oddStars; i++) {
            int spaces = halfStars + oddStars - i; // 공백 개수 계산
            int stars = i * 2 - 1; // 별 개수 계산

            // 왼쪽 공백 출력
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println(); // 다음 행으로 넘어감
        }
        
        for (int i = halfStars; i >= 1; i--) {
            int spaces = halfStars + oddStars - i; // 공백 개수 계산
            int stars = i * 2 - 1; // 별 개수 계산

            // 왼쪽 공백 출력
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println(); // 다음 행으로 넘어감
        }
	}

}
