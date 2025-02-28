import java.util.Scanner;

public class StringFormatting {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println(String.format("The name is %s, and age is %d", name, age));

         
    }
}