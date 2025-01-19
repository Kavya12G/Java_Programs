import java.util.Scanner;

public class ArverageOf2DArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows number: ");
        int row = sc.nextInt();
        System.out.println("Enter columns number: ");
        int col = sc.nextInt();
        int[][] a = new int[row][col];

        System.out.println("Enter array elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            int sum = 0; 
            for (int j = 0; j < col; j++) {
                sum = sum + a[i][j];
            }
            double average = (double)sum / col;
            System.out.println("Average of " + (i+1) + " row is: " + average);
        }
    }
}
