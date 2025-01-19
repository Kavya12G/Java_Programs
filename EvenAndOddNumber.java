import java.util.Scanner;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("First " + n + " even numbers are: ");
        for (int i = 1; i <= n*2; i++) {
            if (i % 2 == 0) {
                System.err.println(i);
            }
        }
        }
    }
