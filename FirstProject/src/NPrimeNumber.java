import java.util.Scanner;
public class NPrimeNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        System.err.println("First " + n + " prime numbers are: ");
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        if (isPrime) {
            System.out.println(num);
            count++;
        }
        num++;
    }
}
}
