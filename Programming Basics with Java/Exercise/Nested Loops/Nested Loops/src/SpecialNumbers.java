import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int special = Integer.parseInt(scanner.nextLine());
        int n;
        String result = "";

        for (int i = 1111; i <= 9999; i++) {
            String number = String.valueOf(i);
            for (int j = 0; j < number.length(); j++) {
                char num = number.charAt(j);
                n = Integer.parseInt(String.valueOf(num));
                if (n <= special && n != 0) {
                    if (special % n == 0) {
                        result = result.concat(String.valueOf(n));
                    }
                }
            }
            if (result.length() >= 4) {
                System.out.print(result + " ");
            }
            result = "";
        }
    }
}
