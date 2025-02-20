import java.util.Scanner;

public class TrainTheTrainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double result = 0;
        double tracker = 0;
        double outcome = 0;

        while (!command.equals("Finish")) {
            String presentation = command;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                result += grade;
            }
            System.out.printf("%s - %.2f.%n", presentation, result / n);
            tracker += n;
            outcome += result;
            result = 0;
            command = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", outcome / tracker);

    }
}
