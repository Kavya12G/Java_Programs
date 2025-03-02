import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() == str2.length() && str1.length() > 0) {
            String str3 = str1 + str2;
            if (str3.contains(str1)) {
                System.out.println("Rotated");
            } else {
                System.out.println("Not Rotated");
            }
        }

    }
}
