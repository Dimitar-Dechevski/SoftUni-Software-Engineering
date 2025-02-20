import java.util.Scanner;

public class SnookerTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticket = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        String picture = scanner.nextLine();
        double result = 0;

        switch (stage) {
            case "Quarter final":
                switch (ticket) {
                    case "Standard":
                        result = count * 55.50;
                        break;
                    case "Premium":
                        result = count * 105.20;
                        break;
                    case "VIP":
                        result = count * 118.90;
                        break;
                }
                if (result > 2500 && result <= 4000) {
                    result = result - (result * 0.10);
                    if (picture.equals("Y")) {
                        result = result + (count * 40.00);
                    }
                } else if (result > 4000) {
                    result = result - (result * 0.25);
                }
                break;
            case "Semi final":
                switch (ticket) {
                    case "Standard":
                        result = count * 75.88;
                        break;
                    case "Premium":
                        result = count * 125.22;
                        break;
                    case "VIP":
                        result = count * 300.40;
                        break;
                }
                if (result > 2500 && result <= 4000) {
                    result = result - (result * 0.10);
                    if (picture.equals("Y")) {
                        result = result + (count * 40.00);
                    }
                } else if (result > 4000) {
                    result = result - (result * 0.25);
                }
                break;
            case "Final":
                switch (ticket) {
                    case "Standard":
                        result = count * 110.10;
                        break;
                    case "Premium":
                        result = count * 160.66;
                        break;
                    case "VIP":
                        result = count * 400.00;
                        break;
                }
                if (result > 2500 && result <= 4000) {
                    result = result - (result * 0.10);
                    if (picture.equals("Y")) {
                        result = result + (count * 40.00);
                    }
                } else if (result > 4000) {
                    result = result - (result * 0.25);
                }
                break;
        }

        System.out.printf("%.2f", result);


    }
}
