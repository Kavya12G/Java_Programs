import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        int k = number;
        while (k > 0) {
            k = k / 10;
            count++;
        }
        System.out.println("Count of " + number + " is " + count);
    }
}
