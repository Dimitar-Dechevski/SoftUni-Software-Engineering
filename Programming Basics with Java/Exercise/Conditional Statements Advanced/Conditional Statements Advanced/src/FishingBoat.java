import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        double result;

        switch (season) {
            case "Spring":
                result = 3000;
                if (number <= 6) {
                    result = result - (result * 0.10);
                } else if (number > 6 && number <= 11) {
                    result = result - (result * 0.15);
                } else if (number > 11) {
                    result = result - (result * 0.25);
                }
                if (number % 2 == 0) {
                    result = result - (result * 0.05);
                }
                if (result <= budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - result);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", result - budget);
                }
                break;
            case "Summer":
                result = 4200;
                if (number <= 6) {
                    result = result - (result * 0.10);
                } else if (number > 6 && number <= 11) {
                    result = result - (result * 0.15);
                } else if (number > 11) {
                    result = result - (result * 0.25);
                }
                if (number % 2 == 0) {
                    result = result - (result * 0.05);
                }
                if (result <= budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - result);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", result - budget);
                }
                break;
            case "Autumn":
                result = 4200;
                if (number <= 6) {
                    result = result - (result * 0.10);
                } else if (number > 6 && number <= 11) {
                    result = result - (result * 0.15);
                } else if (number > 11) {
                    result = result - (result * 0.25);
                }
                if (result <= budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - result);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", result - budget);
                }
                break;
            case "Winter":
                result = 2600;
                if (number <= 6) {
                    result = result - (result * 0.10);
                } else if (number > 6 && number <= 11) {
                    result = result - (result * 0.15);
                } else if (number > 11) {
                    result = result - (result * 0.25);
                }
                if (number % 2 == 0) {
                    result = result - (result * 0.05);
                }
                if (result <= budget) {
                    System.out.printf("Yes! You have %.2f leva left.", budget - result);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", result - budget);
                }
                break;
        }

    }
}
