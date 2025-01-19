import java.util.Scanner;
public class SingleDigitSum {


    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int k = num;
        while (true) {
        
        int sum = 0;
        while (num > 0) {
            int dig = num % 10;
            sum = sum + dig;
            num = num / 10;
        }
        if (sum < 10) {
            System.out.println("Sum of " + k + " is: " + sum);
            break;
        }
        num = sum;
    }
}
}
