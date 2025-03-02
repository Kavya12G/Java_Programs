import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int maxlen = 0;
        for (int i = 0; i < str.length(); i++) {
            String curSubstr = "";
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (curSubstr.indexOf(c) == -1) {
                    curSubstr += c;
                } else {
                    break;
                }

            }
            if (curSubstr.length() > maxlen) {
                maxlen = curSubstr.length();
            }
        
        }
        System.out.println(maxlen);
    }
}
