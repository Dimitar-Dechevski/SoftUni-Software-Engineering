import java.util.Scanner;

public class Volleyball {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if (year.equals("leap")) {
            result = 48 - h;
            result = result * 3 / 4;
            p = p * 2 / 3;
            result = result + p + h;
            result = result + (result * 0.15);
        } else if (year.equals("normal")) {
            result = 48 - h;
            result = result * 3 / 4;
            p = p * 2 / 3;
            result = result + p + h;
        }

        System.out.printf("%.0f", Math.floor(result));

    }
}
