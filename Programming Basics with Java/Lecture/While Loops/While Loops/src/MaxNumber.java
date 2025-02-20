import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int num = Integer.MIN_VALUE;

        while (number <= n) {

            int max = Integer.parseInt(scanner.nextLine());

            if (num < max) {
                num = max;
            }

            number++;
        }

        System.out.println(num);

    }
}
