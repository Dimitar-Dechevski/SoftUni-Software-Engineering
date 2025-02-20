import java.util.Scanner;

public class WarOfNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int result = 0;
        int max = Integer.MIN_VALUE;
        String winner = "";

        while (!name.equals("STOP")) {
            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                result += symbol;
            }
            if (result >= max) {
                max = result;
                winner = name;
            }
            result = 0;
            name = scanner.nextLine();
        }

        System.out.printf("Winner is %s – %d!", winner, max);

    }
}
