import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        double rows = Double.parseDouble(scanner.nextLine());
        double columns = Double.parseDouble(scanner.nextLine());
        double result = rows * columns;
        double turnover;

        if (projection.equals("Premiere")) {
            turnover = result * 12.00;
            System.out.printf("%.2f leva", turnover);
        } else if (projection.equals("Normal")) {
            turnover = result * 7.50;
            System.out.printf("%.2f leva", turnover);
        } else if (projection.equals("Discount")) {
            turnover = result * 5.00;
            System.out.printf("%.2f leva", turnover);
        }

    }
}
