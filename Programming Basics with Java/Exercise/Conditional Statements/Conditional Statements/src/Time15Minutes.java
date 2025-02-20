import java.util.Scanner;

public class Time15Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int newMinutes;

        if (minutes >= 0 && minutes <= 44) {
            newMinutes = minutes + 15;
            System.out.printf("%d:%d", hour, newMinutes);
        } else if (minutes >= 45 && minutes <= 59) {
            if (hour == 23) {
                hour = 0;
            } else {
                hour = hour + 1;
            }
            newMinutes = (minutes + 15) - 60;
            if (newMinutes < 10) {
                System.out.printf("%d:0%d", hour, newMinutes);
            } else {
                System.out.printf("%d:%d", hour, newMinutes);
            }
        }
    }
}
