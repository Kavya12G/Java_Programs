import java.util.Scanner;

public class StringFrequencyCount {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);    
        String str = sc.nextLine();
        int[] a = new int[256];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            if(!Character.isWhitespace(c)) { // it will remove whitespace if you don't want to count whitespaces
            if (a[c] == 0) {
                sb.append(c);
            }
        }
            a[c]++;
        }
        System.out.print("{");
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            
            System.out.print(c + " = " + a[c]);
            
        }   
        System.out.print("}");
    }
}
