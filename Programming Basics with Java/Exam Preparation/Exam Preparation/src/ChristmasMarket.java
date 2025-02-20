import java.util.Scanner;

public class ChristmasMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double fantasy = Double.parseDouble(scanner.nextLine());
        double horror = Double.parseDouble(scanner.nextLine());
        double romantic = Double.parseDouble(scanner.nextLine());
        double result = fantasy * 14.90 + horror * 9.80 + romantic * 4.30;
        result = result - (result * 0.20);

        if (result > money) {
            result = result - money;
            double salary = Math.floor(result * 0.10);
            result = result - salary;
            System.out.printf("%.2f leva donated.%n", result + money);
            System.out.printf("Sellers will receive %.0f leva.", salary);
        } else {
            System.out.printf("%.2f money needed.", money - result);
        }

    }
}
