import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double result = 0;

        while (!command.equals("End")) {
            String country = command;
            double price = Double.parseDouble(scanner.nextLine());
            while (price > result) {
                double money = Double.parseDouble(scanner.nextLine());
                result += money;

            }
            System.out.printf("Going to %s!%n", country);
            result = 0;
            command = scanner.nextLine();
        }
    }
}
