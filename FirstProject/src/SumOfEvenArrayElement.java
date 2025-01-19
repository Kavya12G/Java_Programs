// This is first  DSA program that is why...i commented to some important line for better understanding.. 
import java.util.Scanner;

public class SumOfEvenArrayElement {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // size of an array entered by user
        int[] arr = new int[size]; // creation of 1D array

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // populate the array with user input value
        }

        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]); 
            if (i < size -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { 
            sum = sum + arr[i]; // Calculate sum of all even element in an array
        }
    }
        System.out.println("Sum of even elements: " + sum); // print sum
    }
}

