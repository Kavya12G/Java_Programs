
import java.util.Scanner;

public class SumOfSquare {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }

        System.out.println("Sum of first " + n + " square numbers are: " + sum);
    }
}
