import java.util.Scanner;

public class BachelorParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double singer = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double result = 0;
        double count = 0;

        while (!command.equals("The restaurant is full")) {
            double group = Double.parseDouble(command);
            count += group;
            if (group >= 5) {
                result = result + group * 70.00;
            } else {
                result = result + group * 100.00;
            }
            command = scanner.nextLine();
        }

        if (result >= singer) {
            System.out.printf("You have %.0f guests and %.0f leva left.", count, result - singer);
        } else {
            System.out.printf("You have %.0f guests and %.0f leva income, but no singer.", count, result);
        }


    }
}
