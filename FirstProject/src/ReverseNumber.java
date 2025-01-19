import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int reverse = 0;

        while (number > 0) {
            int dig = number % 10;
            reverse = dig + (reverse * 10);
            number = number / 10;
        }
        System.out.println("Reversed number is: " + reverse);
    }
}
