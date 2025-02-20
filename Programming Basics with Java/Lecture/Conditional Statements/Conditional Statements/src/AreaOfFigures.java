import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double area = side * side;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            double result = length * width;
            System.out.printf("%.3f", result);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area1 = radius * radius * Math.PI;
            System.out.printf("%.3f", area1);
        } else {
            double length1 = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double result1 = (length1 * height) / 2;
            System.out.printf("%.3f", result1);
        }

    }
}
