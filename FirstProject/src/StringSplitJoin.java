import java.util.Scanner;

public class StringSplitJoin {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String space = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        String join = String.join(space, words);
        System.out.println(join);
    }
}
