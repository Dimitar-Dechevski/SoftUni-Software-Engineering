import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double sumP1;
        double sumP2;
        double sumP3;
        double sumP4;
        double sumP5;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number <= 399) {
                p2++;
            } else if (number <= 599) {
                p3++;
            } else if (number <= 799) {
                p4++;
            } else if (number <= 1000) {
                p5++;
            }
        }

        sumP1 = p1 / n * 100;
        sumP2 = p2 / n * 100;
        sumP3 = p3 / n * 100;
        sumP4 = p4 / n * 100;
        sumP5 = p5 / n * 100;

        System.out.printf("%.2f%%%n", sumP1);
        System.out.printf("%.2f%%%n", sumP2);
        System.out.printf("%.2f%%%n", sumP3);
        System.out.printf("%.2f%%%n", sumP4);
        System.out.printf("%.2f%%%n", sumP5);

    }
}
