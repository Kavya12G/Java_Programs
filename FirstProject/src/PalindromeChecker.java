import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = 0;
        int k = num;

        while (num > 0) {
            int dig = num % 10;
            reverse = (reverse*10) + dig;
            num = num/10;
        }

        if (k == reverse) {
            System.out.println(k + " is a Palindrome");
        } else {
            System.out.println(k+ " not a Palindrome");
        }
    }
}
