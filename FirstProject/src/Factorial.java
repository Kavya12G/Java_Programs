import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
        }
        System.out.println("Factorial of " + n + " is: " + p);
    }
}
