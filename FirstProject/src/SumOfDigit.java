
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum = sum + dig;
            n = n / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
