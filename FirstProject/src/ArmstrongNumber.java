import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        int k = number;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        number = k;
        int sum = 0;
        while (k > 0) {
            int dig = k % 10;
            sum = sum + (int) Math.pow(dig , count);
            k = k / 10;
        }
        if (sum == number) {
            System.out.println(number + " is a Armstrong number.");
        } else {
            System.out.println(number + " is a not Armstrong number.");
        }
}
}