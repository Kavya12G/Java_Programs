
import java.util.Scanner;

public class Swap2Number {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("After swapping");
        System.out.println("a = " + b);
        System.out.println("b = " + a);
    }
}
