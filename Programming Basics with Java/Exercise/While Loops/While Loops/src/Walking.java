import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        boolean isSuccess = false;

        while (result < 10000) {
            String command = scanner.nextLine();
            int steps;
            if (command.equals("Going home")) {
                command = scanner.nextLine();
                steps = Integer.parseInt(command);
                result += steps;
                if (result >= 10000) {
                    System.out.println("Goal reached! Good job!");
                    isSuccess = true;
                } else {
                    System.out.printf("%d more steps to reach goal.", 10000 - result);
                }
                break;
            } else {
                steps = Integer.parseInt(command);
                result += steps;
                if (result >= 10000) {
                    System.out.println("Goal reached! Good job!");
                }
            }
        }
    }
}
