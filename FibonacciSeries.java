import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    
        int a = 0; int b = 1;
        System.out.print("Fibonacci series is: " + a);
        while (b <= n) {
            int temp = a + b; 
            a = b; 
            b = temp;
            System.out.print(" " + b);
        }
    }
}
