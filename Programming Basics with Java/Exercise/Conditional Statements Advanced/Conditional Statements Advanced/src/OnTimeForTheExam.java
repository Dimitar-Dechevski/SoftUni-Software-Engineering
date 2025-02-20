import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMinute;
        int time = hour * 60 + minute;
        int m;
        int h;

        if (examTime < time) {
            m = time - examTime;
            if (m < 60) {
                if (m < 10) {
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", m);
                } else {
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", m);
                }
            } else {
                h = m / 60;
                m = m - (h * 60);
                if (m < 10) {
                    System.out.println("Late");
                    System.out.printf("%d:0%d hours after the start", h, m);
                } else {
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", h, m);
                }
            }
        } else if (examTime == time) {
            System.out.println("On time");
        } else {
            m = examTime - time;
            if (m <= 30) {
                if (m < 10) {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start", m);
                } else {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start", m);
                }
            } else if (m < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", m);
            } else if (m == 60) {
                h = m / 60;
                m = 0;
                System.out.println("Early");
                System.out.printf("%d:0%d hours before the start", h, m);
            } else {
                h = m / 60;
                m = m - (h * 60);
                if (m < 10) {
                    System.out.println("Early");
                    System.out.printf("%d:0%d hours before the start", h, m);
                } else {
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start", h, m);
                }
            }
        }

    }
}

