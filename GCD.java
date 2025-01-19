import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (num2 > 0) {
            int rem = num2 % num1;
            if (rem == 0) {
                System.out.println("GCD is: " + num1);
                break;
            }
            num2 = num1; 
            num1 = rem;
        }
    }
}
