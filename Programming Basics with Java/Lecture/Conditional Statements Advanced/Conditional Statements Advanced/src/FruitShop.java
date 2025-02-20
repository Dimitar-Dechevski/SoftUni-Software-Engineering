import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double result;


        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")) {
            switch (product) {
                case "banana":
                    result = quantity * 2.50;
                    System.out.printf("%.2f", result);
                    break;
                case "apple":
                    result = quantity * 1.20;
                    System.out.printf("%.2f", result);
                    break;
                case "orange":
                    result = quantity * 0.85;
                    System.out.printf("%.2f", result);
                    break;
                case "grapefruit":
                    result = quantity * 1.45;
                    System.out.printf("%.2f", result);
                    break;
                case "kiwi":
                    result = quantity * 2.70;
                    System.out.printf("%.2f", result);
                    break;
                case "pineapple":
                    result = quantity * 5.50;
                    System.out.printf("%.2f", result);
                    break;
                case "grapes":
                    result = quantity * 3.85;
                    System.out.printf("%.2f", result);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (product) {
                case "banana":
                    result = quantity * 2.70;
                    System.out.printf("%.2f", result);
                    break;
                case "apple":
                    result = quantity * 1.25;
                    System.out.printf("%.2f", result);
                    break;
                case "orange":
                    result = quantity * 0.90;
                    System.out.printf("%.2f", result);
                    break;
                case "grapefruit":
                    result = quantity * 1.60;
                    System.out.printf("%.2f", result);
                    break;
                case "kiwi":
                    result = quantity * 3.00;
                    System.out.printf("%.2f", result);
                    break;
                case "pineapple":
                    result = quantity * 5.60;
                    System.out.printf("%.2f", result);
                    break;
                case "grapes":
                    result = quantity * 4.20;
                    System.out.printf("%.2f", result);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }

    }
}
