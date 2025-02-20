import java.util.Scanner;

public class MovieRating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double result = 0;
        String maximal = "";
        String minimal = "";

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            result += rating;
            if (rating > max) {
                max = rating;
                maximal = name;
            }
            if (rating < min) {
                min = rating;
                minimal = name;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n", maximal, max);
        System.out.printf("%s is with lowest rating: %.1f%n", minimal, min);
        System.out.printf("Average rating: %.1f%n", result / n);

    }
}
