import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double puzzles = Double.parseDouble(scanner.nextLine());
        double dolls = Double.parseDouble(scanner.nextLine());
        double bears = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());

        double turnover = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        double count = puzzles + dolls + bears + minions + trucks;

        if (count >= 50) {
            turnover = turnover - (turnover * 0.25);
            turnover = turnover - (turnover * 0.10);
            if (turnover >= tripPrice) {
                double result = turnover - tripPrice;
                System.out.printf("Yes! %.2f lv left.", result);
            } else {
                double result1 = tripPrice - turnover;
                System.out.printf("Not enough money! %.2f lv needed.", result1);
            }
        } else {
            turnover = turnover - (turnover * 0.10);
            if (turnover >= tripPrice) {
                double result = turnover - tripPrice;
                System.out.printf("Yes! %.2f lv left.", result);
            } else {
                double result1 = tripPrice - turnover;
                System.out.printf("Not enough money! %.2f lv needed.", result1);
            }
        }
    }
}
