import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double result;
        String destination;
        String place;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                place = "Camp";
                result = budget * 0.30;
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", place, result);
            } else if (season.equals("winter")) {
                place = "Hotel";
                result = budget * 0.70;
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", place, result);
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                place = "Camp";
                result = budget * 0.40;
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", place, result);
            } else if (season.equals("winter")) {
                place = "Hotel";
                result = budget * 0.80;
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", place, result);
            }
        } else if (budget > 1000) {
            destination = "Europe";
            place = "Hotel";
            if (season.equals("summer")) {
                result = budget * 0.90;
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", place, result);
            } else if (season.equals("winter")) {
                result = budget * 0.90;
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", place, result);
            }
        }

    }
}
