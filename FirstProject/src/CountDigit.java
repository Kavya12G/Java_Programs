import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    String str = String.valueOf(num);
    int[] a = new int[10];

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        int dig = c - '0';
        if (a[dig] == 0) {
            sb.append(c);
        }
        a[dig]++;
    }
    for (int i = 0; i < sb.length(); i++) {
        char c = sb.charAt(i);
        int dig = c - '0';
        System.out.println(c + ":" + a[dig]);
    }   
    }
    
}