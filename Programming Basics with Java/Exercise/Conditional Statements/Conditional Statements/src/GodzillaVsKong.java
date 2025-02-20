import java.util.Scanner;

public class GodzillaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double actors = Double.parseDouble(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        double clothes = actors * priceClothes;

        if (actors > 150) {
            clothes = clothes - (clothes * 0.10);
        }

        double result = clothes + decor;

        if (result > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", result - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - result);
        }

    }
}
