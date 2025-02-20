import java.util.Scanner;

public class AlcoholMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWhisky = Double.parseDouble(scanner.nextLine());
        double beerLitre = Double.parseDouble(scanner.nextLine());
        double wineLitre = Double.parseDouble(scanner.nextLine());
        double rakiqLitre = Double.parseDouble(scanner.nextLine());
        double whiskyLitre = Double.parseDouble(scanner.nextLine());
        double priceRakiq =  priceWhisky - (priceWhisky * 0.5);
        double priceWine = priceRakiq - (priceRakiq * 0.4);
        double priceBeer = priceRakiq - (priceRakiq * 0.8);

        double result = (priceWhisky * whiskyLitre) + (beerLitre * priceBeer) + (wineLitre * priceWine) + (rakiqLitre * priceRakiq);

        System.out.printf("%.2f", result);

    }
}
