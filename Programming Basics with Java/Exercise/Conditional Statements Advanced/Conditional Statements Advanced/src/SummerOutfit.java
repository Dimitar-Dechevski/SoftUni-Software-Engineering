import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());
        String stage = scanner.nextLine();
        String outfit;
        String shoes;

        if (degrees >= 10 && degrees <= 18) {
            if (stage.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (stage.equals("Afternoon") || stage.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (stage.equals("Morning") || stage.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (stage.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        } else if (degrees >= 25) {
            if (stage.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (stage.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (stage.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        }

    }
}
