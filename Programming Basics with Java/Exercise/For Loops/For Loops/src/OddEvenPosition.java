import java.util.Scanner;

public class OddEvenPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double resultOdd = 0;
        double resultEven = 0;
        double maxEven = -1000000000.0;
        double maxOdd = -1000000000.0;
        double minEven = 1000000000.0;
        double minOdd = 1000000000.0;


        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                if (number >= maxEven) {
                    maxEven = number;
                }
                if (number <= minEven) {
                    minEven = number;
                }
                resultEven += number;
            } else {
                if (number >= maxOdd) {
                    maxOdd = number;
                }
                if (number <= minOdd) {
                    minOdd = number;
                }
                resultOdd += number;
            }
        }

        if (n > 1) {
            System.out.printf("OddSum=%.2f,%n", resultOdd);
            System.out.printf("OddMin=%.2f,%n", minOdd);
            System.out.printf("OddMax=%.2f,%n", maxOdd);
            System.out.printf("EvenSum=%.2f,%n", resultEven);
            System.out.printf("EvenMin=%.2f,%n", minEven);
            System.out.printf("EvenMax=%.2f%n", maxEven);

        } else if (n == 1) {
            System.out.printf("OddSum=%.2f,%n", resultOdd);
            System.out.printf("OddMin=%.2f,%n", minOdd);
            System.out.printf("OddMax=%.2f,%n", maxOdd);
            System.out.printf("EvenSum=%.2f,%n", resultEven);
            System.out.println("EvenMin=" + "No,");
            System.out.println("EvenMax=" + "No");

        } else if (n == 0) {
            System.out.printf("OddSum=%.2f,%n", resultOdd);
            System.out.println("OddMin=" + "No,");
            System.out.println("OddMax=" + "No,");
            System.out.printf("EvenSum=%.2f,%n", resultEven);
            System.out.println("EvenMin=" + "No,");
            System.out.println("EvenMax=" + "No");
        }

    }
}
