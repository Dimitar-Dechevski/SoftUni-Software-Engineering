import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double area = length * width * height;
        double liters = area * 0.001;
        double finalPercent = percent * 0.01;
        double needLiters = liters * (1 - finalPercent);

        System.out.printf("%.3f", needLiters);

    }
}
