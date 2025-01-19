public class TriangleAlpha {
    public static void main(String[] args) {
        for (int i = 'A'; i <='E'; i++) {
            for (int j = 'A'; j <= i; j++) {
                System.out.print((char)i);
            }
            System.out.println();
        }

        for (int i = 'D'; i >='A'; i--) {
            for (int j = 'A'; j <= i; j++) {
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}
