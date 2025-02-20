import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double result = number;
        double bonus = 0;

        if (number % 2 == 0) {
            bonus = 1;
            if (number <= 100) {
                bonus = bonus + 5;
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            } else if (number > 100 && number < 1000) {
                bonus = bonus + (number * 0.20);
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            } else if (number >= 1000) {
                bonus = bonus + (number * 0.10);
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            }
        } else if (number % 5 ==  0) {
            bonus = 2;
            if (number <= 100) {
                bonus = bonus + 5;
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            } else if (number > 100 && number < 1000) {
                bonus = bonus + (number * 0.20);
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            } else if (number >= 1000) {
                bonus = bonus + (number * 0.10);
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            }
        } else {
            if (number <= 100) {
                bonus = bonus + 5;
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            } else if (number > 100 && number < 1000) {
                bonus = bonus + (number * 0.20);
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            } else if (number >= 1000) {
                bonus = bonus + (number * 0.10);
                result = result + bonus;
                System.out.printf("%.1f%n", bonus);
                System.out.printf("%.1f%n", result);
            }
        }

    }
}
