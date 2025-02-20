import java.util.Scanner;

public class TailoringWorkshop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double area = number * (length + 2 * 0.30) * (width + 2 * 0.30);
        double area1 = number * (length / 2) * (length / 2);

        double priceUsd = area * 7 + area1 * 9;
        double priceBgn = priceUsd * 1.85;

        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN%n", priceBgn);

    }
}
