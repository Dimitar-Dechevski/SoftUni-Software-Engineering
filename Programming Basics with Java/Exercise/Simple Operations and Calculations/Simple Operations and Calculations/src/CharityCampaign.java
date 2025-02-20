import java.util.Scanner;

public class CharityCampaign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double day = Double.parseDouble(scanner.nextLine());
        double worker = Double.parseDouble(scanner.nextLine());
        double cake = Double.parseDouble(scanner.nextLine());
        double waffle  = Double.parseDouble(scanner.nextLine());
        double pancake = Double.parseDouble(scanner.nextLine());

        double resultCake = cake * 45;
        double resultWaffle = waffle * 5.80;
        double resultPancake = pancake * 3.20;
        double resultWorker = (resultCake + resultWaffle + resultPancake) * worker;
        double result = resultWorker * day;
        double finalResult = result - (result / 1/8);

        System.out.printf("%.2f", finalResult);

    }
}
