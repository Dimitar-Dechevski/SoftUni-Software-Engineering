import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int equal = 0;
        int diff = 0;
        int result = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                int number = Integer.parseInt(scanner.nextLine());
                result += number;
            }
            diff = Math.abs(result - equal);
            equal = result;
            result = 0;
        }

        if (diff == 0) {
            System.out.printf("Yes, sum = %d", equal);
        } else {
            System.out.printf("No, diff = %d", diff);
        }

    }
}
