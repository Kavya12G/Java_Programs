public class SquareNumber {
    public static void main(String[] args) {
        int num = 2;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.printf("%02d ", num);
                num = num + 2;
            }
            System.out.println();
        }
    }
}

