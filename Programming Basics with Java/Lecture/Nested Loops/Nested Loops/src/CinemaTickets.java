import java.util.Scanner;

public class CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String movie;
        double count = 0;
        double standard = 0;
        double student = 0;
        double kid = 0;
        double tracker = 0;

        while (!command.equals("Finish")) {
            movie = command;
            double seat = Double.parseDouble(scanner.nextLine());
            for (int i = 0; i < seat; i++) {
                String ticket = scanner.nextLine();
                if (ticket.equals("End")) {
                    break;
                }
                count++;
                tracker++;
                switch (ticket) {
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                    case "student":
                        student++;
                        break;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", movie, count / seat * 100);
            count = 0;
            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %.0f%n", tracker);
        System.out.printf("%.2f%% student tickets.%n", student / tracker * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard / tracker * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid / tracker * 100);

    }
}
