import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int num = Integer.MAX_VALUE;

        while (number <= n) {

            int min = Integer.parseInt(scanner.nextLine());

            if (num > min) {
                num = min;
            }

            number++;
        }

        System.out.println(num);

    }
}
