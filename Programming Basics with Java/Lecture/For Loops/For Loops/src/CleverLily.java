import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double machine = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());
        double toy = 0;
        double money = 0;
        double result = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money++;
                result = result + 10.00 * money;
                result = result - 1.00;
            } else {
                toy++;
            }
        }

        result = result + toy * priceToy;

        if (result >= machine) {
            System.out.printf("Yes! %.2f", result - machine);
        } else {
            System.out.printf("No! %.2f", machine - result);
        }

    }
}
