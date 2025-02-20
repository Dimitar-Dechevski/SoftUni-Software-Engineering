import java.util.Scanner;

public class ChristmasDecorations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;
        boolean isFailed = false;


        while (!command.equals("Stop")) {
            String decoration = command;
            for (int i = 0; i < decoration.length(); i++) {
                char symbol = decoration.charAt(i);
                price += (double) symbol;
            }
            if (money >= price) {
                money -= price;
                System.out.println("Item successfully purchased!");
                price = 0;
            } else {
                System.out.println("Not enough money!");
                isFailed = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (!isFailed) {
            System.out.printf("Money left: %.0f%n", money);
        }
    }
}
