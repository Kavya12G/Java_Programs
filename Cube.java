
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int cube = (int)Math.pow(i, 3);
            System.out.println(i + " cube is: " + cube);
        }
    }
}
