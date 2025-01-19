import java.util.Scanner;
public class ReverseArray {
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


        int[] reverseArray = new int[size];
        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[size-1-i];
        }

        System.out.print("Reversed Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reverseArray[i]); 
            if (i < size -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

