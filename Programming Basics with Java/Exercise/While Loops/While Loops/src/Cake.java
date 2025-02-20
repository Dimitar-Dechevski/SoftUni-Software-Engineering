import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int result = width * length;
        int piece;
        int rest = 0;
        boolean isSuccess = false;
        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            piece = Integer.parseInt(command);
            rest += piece;
            if (rest > result) {
                System.out.printf("No more cake left! You need %d pieces more.", rest - result);
                isSuccess = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (!isSuccess) {
            System.out.printf("%d pieces are left.", result - rest);
        }

    }
}
