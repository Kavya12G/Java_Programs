import java.util.Scanner;
public class IndexOf {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        // String target = sc.nextLine();
        // System.out.println(str.indexOf(target));  
        System.out.println(str.charAt(num));
    }
}

// In this code both method(.indexOf() and .charAt())