import java.util.Scanner;

public class ChristmasSweets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBaklava = Double.parseDouble(scanner.nextLine());
        double priceMuffin = Double.parseDouble(scanner.nextLine());
        double stolen = Double.parseDouble(scanner.nextLine());
        double bonbon = Double.parseDouble(scanner.nextLine());
        double biscuit = Double.parseDouble(scanner.nextLine());
        double priceStolen = priceBaklava + (priceBaklava * 0.60);
        double priceBonbon = priceMuffin + (priceMuffin * 0.80);
        double priceBiscuit = 7.50;
        double result = stolen * priceStolen + bonbon * priceBonbon + biscuit * priceBiscuit;
        System.out.printf("%.2f", result);

    }
}
