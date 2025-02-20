import java.util.Scanner;

public class EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = num1; i <= num2; i++) {
            String number = String.valueOf(i);
            for (int j = 0; j < number.length(); j++) {
                char symbol = number.charAt(j);
                int num = Integer.parseInt(String.valueOf(symbol));
                if (j % 2 == 0) {
                    even += num;
                } else {
                    odd += num;
                }
            }
            if (odd == even) {
                System.out.print(number + " ");
            }
            even = 0;
            odd = 0;
        }
    }
}
