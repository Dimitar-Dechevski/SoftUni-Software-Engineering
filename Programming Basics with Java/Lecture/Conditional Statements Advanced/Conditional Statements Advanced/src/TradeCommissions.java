import java.util.Scanner;

public class TradeCommissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double result;

        if (sales >= 0 && sales <= 500) {
            switch (city) {
                case "Sofia":
                    result = sales * 0.05;
                    System.out.printf("%.2f", result);
                    break;
                case "Varna":
                    result = sales * 0.045;
                    System.out.printf("%.2f", result);
                    break;
                case "Plovdiv":
                    result = sales * 0.055;
                    System.out.printf("%.2f", result);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales > 500 && sales <= 1000) {
            switch (city) {
                case "Sofia":
                    result = sales * 0.07;
                    System.out.printf("%.2f", result);
                    break;
                case "Varna":
                    result = sales * 0.075;
                    System.out.printf("%.2f", result);
                    break;
                case "Plovdiv":
                    result = sales * 0.08;
                    System.out.printf("%.2f", result);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales > 1000 && sales <= 10000) {
            switch (city) {
                case "Sofia":
                    result = sales * 0.08;
                    System.out.printf("%.2f", result);
                    break;
                case "Varna":
                    result = sales * 0.10;
                    System.out.printf("%.2f", result);
                    break;
                case "Plovdiv":
                    result = sales * 0.12;
                    System.out.printf("%.2f", result);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sales > 10000) {
            switch (city) {
                case "Sofia":
                    result = sales * 0.12;
                    System.out.printf("%.2f", result);
                    break;
                case "Varna":
                    result = sales * 0.13;
                    System.out.printf("%.2f", result);
                    break;
                case "Plovdiv":
                    result = sales * 0.145;
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
