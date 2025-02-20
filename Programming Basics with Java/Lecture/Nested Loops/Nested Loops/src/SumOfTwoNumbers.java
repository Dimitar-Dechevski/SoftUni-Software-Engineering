import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isSuccess = false;
        int count = 0;
        int tracker = 0;
        int number1 = 0;
        int number2 = 0;


        for (int i = num1; i <= num2; i++) {
            for (int j = num1; j <= num2; j++) {
                count++;
                if (!isSuccess) {
                    if (i + j == magicNumber) {
                        tracker = count;
                        number1 = i;
                        number2 = j;
                        isSuccess = true;
                    }
                }
            }
        }

        if (isSuccess) {
            System.out.printf("Combination N:%d (%d + %d = %d)", tracker, number1, number2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }

    }
}
