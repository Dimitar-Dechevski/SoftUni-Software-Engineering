import java.util.Scanner;

public class Graduation2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double counter = 1;
        double result = 0;
        double fail = 0;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                result += grade;
                counter++;
            } else {
                fail++;
                if (fail > 1) {
                    break;
                }
            }
        }

        if (counter < 12) {
            System.out.printf("%s has been excluded at %.0f grade", name, counter);
        } else {
            result = result / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, result);
        }
    }
}
