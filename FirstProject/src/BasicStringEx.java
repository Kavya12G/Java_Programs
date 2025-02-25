

import java.util.Scanner;

public class BasicStringEx {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("The text entered by user is: " + str);
    sc.close();
    }
    
}
