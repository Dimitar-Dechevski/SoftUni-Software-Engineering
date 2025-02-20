import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double sideWardrobe = Double.parseDouble(scanner.nextLine());

        double area = (length * 100) * (width * 100);
        double areaWardrobe = (sideWardrobe * 100) * (sideWardrobe * 100);
        double areaBench = area / 10;
        double freeArea = area - areaWardrobe - areaBench;
        double dancers = Math.floor(freeArea / (40 + 7000));

        System.out.printf("%.0f", dancers);

    }
}
