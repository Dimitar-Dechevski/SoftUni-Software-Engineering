import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double result;

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    result = quantity * 0.50;
                    System.out.printf("%f", result);
                    break;
                case "water":
                    result = quantity * 0.80;
                    System.out.printf("%f", result);
                    break;
                case "beer":
                    result = quantity * 1.20;
                    System.out.printf("%f", result);
                    break;
                case "sweets":
                    result = quantity * 1.45;
                    System.out.printf("%f", result);
                    break;
                case "peanuts":
                    result = quantity * 1.60;
                    System.out.printf("%f", result);
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    result = quantity * 0.40;
                    System.out.printf("%f", result);
                    break;
                case "water":
                    result = quantity * 0.70;
                    System.out.printf("%f", result);
                    break;
                case "beer":
                    result = quantity * 1.15;
                    System.out.printf("%f", result);
                    break;
                case "sweets":
                    result = quantity * 1.30;
                    System.out.printf("%f", result);
                    break;
                case "peanuts":
                    result = quantity * 1.50;
                    System.out.printf("%f", result);
                    break;
            }
        } else if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    result = quantity * 0.45;
                    System.out.printf("%f", result);
                    break;
                case "water":
                    result = quantity * 0.70;
                    System.out.printf("%f", result);
                    break;
                case "beer":
                    result = quantity * 1.10;
                    System.out.printf("%f", result);
                    break;
                case "sweets":
                    result = quantity * 1.35;
                    System.out.printf("%f", result);
                    break;
                case "peanuts":
                    result = quantity * 1.55;
                    System.out.printf("%f", result);
                    break;
            }
        }


    }
}
