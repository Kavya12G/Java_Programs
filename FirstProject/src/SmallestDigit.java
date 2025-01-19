import java.util.Scanner;
public class SmallestDigit {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int min = num % 10;
        while (num > 0) {
            int dig = num % 10;
            if (dig < min) {
                min = dig;
            }
        num = num / 10;
        }
        System.out.println("Smallest digit is: " + min);
    }
}
