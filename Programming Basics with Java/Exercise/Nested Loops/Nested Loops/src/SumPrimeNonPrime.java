import java.util.Scanner;

public class SumPrimeNonPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int prime = 0;
        int noPrime = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number > max && number < min) {
                if (number < 0) {
                    System.out.println("Number is negative.");
                } else if (number == 0) {
                    noPrime += number;
                } else {
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        prime += number;
                    } else {
                        noPrime += number;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", noPrime);
    }
}