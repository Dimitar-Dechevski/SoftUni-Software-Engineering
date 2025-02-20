import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rest = Double.parseDouble(scanner.nextLine());
        double coins = 0;
        rest = Math.round(rest * 100);


        while (rest > 0) {
            if (rest >= 200) {
                rest = rest - 200;
                coins++;
            } else if (rest >= 100) {
                rest = rest - 100;
                coins++;
            } else if (rest >= 50) {
                rest = rest - 50;
                coins++;
            } else if (rest >= 20) {
                rest = rest - 20;
                coins++;
            } else if (rest >= 10) {
                rest = rest - 10;
                coins++;
            } else if (rest >= 5) {
                rest = rest - 5;
                coins++;
            } else if (rest >= 2) {
                rest = rest - 2;
                coins++;
            } else if (rest >= 1) {
                rest = rest - 1;
                coins++;
            }
        }

        System.out.printf("%.0f", coins);

    }
}
