package practice;

public class Q3 {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        int count = 0;

        for (int i = 2; i < 10 && count < 5; i += 2) {
            numbers[count] = i;
            sum += i;
            count++;
            System.out.println("배열에 저장된 짝수: " + numbers[count]);
        }
        System.out.println("짝수의 합: " + sum);
    }
}
