import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int transaction = Integer.parseInt(scanner.nextLine());
        int number = 1;
        double result = 0;

        while (number <= transaction) {

            double sum = Double.parseDouble(scanner.nextLine());

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                result += sum;
                System.out.printf("Increase: %.2f%n", sum);
            }

            number++;

        }

        System.out.printf("Total: %.2f", result);

    }
}
