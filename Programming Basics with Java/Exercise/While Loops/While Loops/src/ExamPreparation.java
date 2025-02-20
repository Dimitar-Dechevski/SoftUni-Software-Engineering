import java.util.Scanner;

public class ExamPreparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double failedGrade = Double.parseDouble(scanner.nextLine());
        double count = 0;
        double result = 0;
        double tracker = 0;
        String name = "";
        boolean isFailed = false;

        while (count < failedGrade) {
            String task = scanner.nextLine();
            if (task.equals("Enough")) {
                isFailed = true;
                break;
            } else {
                double grade = Double.parseDouble(scanner.nextLine());
                if (grade <= 4.00) {
                    count++;
                }
                name = task;
                tracker++;
                result += grade;
            }
        }

        if (!isFailed) {
            System.out.printf("You need a break, %.0f poor grades.", failedGrade);
        } else {
            System.out.printf("Average score: %.2f%n", result / tracker);
            System.out.printf("Number of problems: %.0f%n", tracker);
            System.out.printf("Last problem: %s", name);
        }

    }
}
