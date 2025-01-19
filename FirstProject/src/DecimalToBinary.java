import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        String bin = "";
        int k = decimal;
        while(decimal > 0) {
            int rem = decimal % 2;
            bin = rem + bin;
            decimal = decimal / 2;
        }
        System.out.println("Binary of " + k + " is: " + bin);
    }
}
