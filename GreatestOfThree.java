import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2) {
            System.err.println(n1 + " is greater.");
        } else if (n2 > n3) {
            System.err.println(n2 + " is greater.");
        } else {
            System.err.println(n3 + " is greater.");
        }

    }
}
