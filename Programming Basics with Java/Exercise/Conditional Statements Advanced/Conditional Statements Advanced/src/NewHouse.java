import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String flower = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (flower.equals("Roses")) {
            result = count * 5.00;
            if (count > 80) {
                result = result - (result * 0.10);
            }
        } else if (flower.equals("Dahlias")) {
            result = count * 3.80;
            if (count > 90) {
                result = result - (result * 0.15);
            }
        } else if (flower.equals("Tulips")) {
            result = count * 2.80;
            if (count > 80) {
                result = result - (result * 0.15);
            }
        } else if (flower.equals("Narcissus")) {
            result = count * 3.00;
            if (count < 120) {
                result = result + (result * 0.15);
            }
        } else if (flower.equals("Gladiolus")) {
            result = count * 2.50;
            if (count < 80) {
                result = result + (result * 0.20);
            }
        }

        if (result > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", result - budget);
        } else {
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", count, flower, budget - result);
        }

    }
}
