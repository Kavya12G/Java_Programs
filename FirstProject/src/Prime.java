import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("is a prime number");
        } else {
            System.out.println("not a prime number.");
        }
    }
}
