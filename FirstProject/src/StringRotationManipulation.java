import java.util.Scanner;

public class StringRotationManipulation {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int pos = sc.nextInt();
        sc.nextLine();
        String direction = sc.nextLine();

        if (direction.equalsIgnoreCase("left")) {
            System.out.println(str.substring(pos) + str.substring(0, pos));
        } else if (direction.equalsIgnoreCase("right")) {
            System.out.println(str.substring(str.length()-pos) + (str.substring(0, str.length()-1)));
        } else {
            System.out.println("Invalid");
        }
    }
}
