import java.util.Scanner;

public class Graduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double counter = 1;
        double result = 0;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                result += grade;
                counter++;
            }
        }

        result = result / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, result);

    }
}
