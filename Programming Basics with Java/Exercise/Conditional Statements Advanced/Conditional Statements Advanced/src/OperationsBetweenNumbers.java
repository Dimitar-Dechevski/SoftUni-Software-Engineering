import java.util.Scanner;

public class OperationsBetweenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double result;
        String outcome;

        if (operation.equals("+")) {
            result = num1 + num2;
            if (result % 2 == 0) {
                outcome = "even";
            } else {
                outcome = "odd";
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operation, num2, result, outcome);
        } else if (operation.equals("-")) {
            result = num1 - num2;
            if (result % 2 == 0) {
                outcome = "even";
            } else {
                outcome = "odd";
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operation, num2, result, outcome);
        } else if (operation.equals("*")) {
            result = num1 * num2;
            if (result % 2 == 0) {
                outcome = "even";
            } else {
                outcome = "odd";
            }
            System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operation, num2, result, outcome);
        } else if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", num1);
            } else {
                result = num1 / num2;
                System.out.printf("%.0f / %.0f = %.2f", num1, num2, result);
            }
        } else if (operation.equals("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", num1);
            } else {
                result = num1 % num2;
                System.out.printf("%.0f %% %.0f = %.0f", num1, num2, result);
            }
        }


    }
}
