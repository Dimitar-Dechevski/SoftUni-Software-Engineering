import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());

        double time = meters * seconds;
        double retard = Math.floor(meters / 15);
        double retardTime = retard * 12.5;
        double result = time + retardTime;

        if (record > result) {
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", result);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", result - record);
        }

    }
}
