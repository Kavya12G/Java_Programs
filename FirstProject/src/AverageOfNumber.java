
import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double avg = (num1 + num2) / 2;
        System.err.println("Average is: " + avg);
    }
}
