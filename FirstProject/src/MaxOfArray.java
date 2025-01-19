import java.util.Scanner;
public class MaxOfArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); 
        int[] arr = new int[size]; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }

        System.out.print("Original Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]); 
            if (i < size -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum is: " + max);
    }
}
