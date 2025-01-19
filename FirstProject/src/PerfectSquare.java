import java.util.Scanner;public class PerfectSquare {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        double sq = Math.sqrt(num);
        double per = Math.floor(sq);

        if (sq == per) {
            System.out.println(num + " is perfect square");
        } else {
            System.out.println(num + " is not perfect sq");
        }
    }
}
