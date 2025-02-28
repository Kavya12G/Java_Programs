
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

        //using StringBuilder()
        
        // StringBuilder sb = new StringBuilder(str);
        // sb.reverse();
        // System.out.println(sb);

    }
}
