import java.util.Scanner;

public class Coding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        for (int i = 1; i <= number.length(); i++) {
            char num = number.charAt(number.length() - i);
            if (num == '0') {
                System.out.println("ZERO");
            } else {
                int n = Integer.parseInt(String.valueOf(num));
                int result = n + 33;
                num = (char) (Integer.parseInt(String.valueOf(num)) + 33);
                for (int j = 0; j < n; j++) {
                    System.out.print(num);
                }
                System.out.println();
            }
        }
    }
}
