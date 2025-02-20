import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int day = 0;
        int daySpend = 0;

        while (daySpend <= 5 && trip > money) {
            String command = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());
            day++;
            if (command.equals("spend")) {
                daySpend++;
                if (daySpend == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(day);
                    break;
                }
                money -= cash;
                if (money < 0) {
                    money = 0;
                }
            } else if (command.equals("save")) {
                money += cash;
                daySpend = 0;
                if (money >= trip) {
                    System.out.printf("You saved the money for %d days.", day);
                }
            }
        }
    }
}
