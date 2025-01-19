public class TriaglewithSpace {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k <= i; k++) {
                System.out.print("*"); // without space
            }
            System.out.println();
        }
    }
}

// Inverted Triangle

// public class TriaglewithSpace {
//     public static void main(String[] args) {
//         for (int i = 4; i >= 0; i--) {
//             for (int j = 1; j <= 5-i; j++) {
//                 System.out.print(" ");
//             }

//             for(int k = 0; k <= i; k++) {
//                 System.out.print("*" + " "); // with space(difference in output)
//             }
//             System.out.println();
//         }
//     }
// }




