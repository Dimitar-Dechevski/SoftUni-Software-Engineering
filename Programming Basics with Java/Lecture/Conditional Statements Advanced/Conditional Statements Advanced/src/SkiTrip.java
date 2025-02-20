import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        String room = scanner.nextLine();
        String rate = scanner.nextLine();
        double result;


        if (days < 10) {
            switch (room) {
                case "room for one person":
                    result = (days - 1) * 18.00;
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
                case "apartment":
                    result = (days - 1) * 25.00;
                    result = result - (result * 0.30);
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
                case "president apartment":
                    result = (days - 1) * 35.00;
                    result = result - (result * 0.10);
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
            }
        } else if (days >= 10 && days <= 15) {
            switch (room) {
                case "room for one person":
                    result = (days - 1) * 18.00;
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
                case "apartment":
                    result = (days - 1) * 25.00;
                    result = result - (result * 0.35);
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
                case "president apartment":
                    result = (days - 1) * 35.00;
                    result = result - (result * 0.15);
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
            }
        } else {
            switch (room) {
                case "room for one person":
                    result = (days - 1) * 18.00;
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
                case "apartment":
                    result = (days - 1) * 25.00;
                    result = result - (result * 0.50);
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
                case "president apartment":
                    result = (days - 1) * 35.00;
                    result = result - (result * 0.20);
                    if (rate.equals("positive")) {
                        result = result + (result * 0.25);
                    } else {
                        result = result - (result * 0.10);
                    }
                    System.out.printf("%.2f", result);
                    break;
            }
        }


    }
}
