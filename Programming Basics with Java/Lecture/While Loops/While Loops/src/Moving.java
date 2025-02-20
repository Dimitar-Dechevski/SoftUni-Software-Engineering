import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double result = width * length * height;
        String command = scanner.nextLine();
        double space = 0;

        while (!command.equals("Done")) {
            double box = Double.parseDouble(command);
            space += box;
            if (space > result) {
                System.out.printf("No more free space! You need %.0f Cubic meters more.", space - result);
                break;
            } else {
                command = scanner.nextLine();
            }
        }

        if (result >= space) {
            System.out.printf("%.0f Cubic meters left.", result - space);
        }

    }
}
