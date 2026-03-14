public class pattern {
    public static void main(String[] args) {

        int n = 4;

        //first part
        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

            // sencod part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}