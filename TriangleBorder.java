public class TriangleBorder {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (i == 0 || i == 4 || k == 0 || k == i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
