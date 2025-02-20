import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.equals("mm")) {
            if (second.equals("cm")) {
                number = number / 10;
                System.out.printf("%.3f", number);
            } else {
                number = number / 1000;
                System.out.printf("%.3f", number);
            }
        } else if (first.equals("cm")) {
            if (second.equals("mm")) {
                number = number * 10;
                System.out.printf("%.3f", number);
            } else {
                number = number / 100;
                System.out.printf("%.3f", number);
            }
        } else {
            if (second.equals("mm")) {
                number = number * 1000;
                System.out.printf("%.3f", number);
            } else {
                number = number * 100;
                System.out.printf("%.3f", number);
            }
        }

    }
}
