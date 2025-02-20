import java.util.Scanner;

public class Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int room = Integer.parseInt(scanner.nextLine());

        for (int i = floor; i >= 1; i--) {
            for (int j = 0; j < room; j++) {
                if (i == floor) {
                    System.out.print("L" + i + j + " ");
                } else if (i % 2 == 0) {
                    System.out.print("O" + i + j + " ");
                } else {
                    System.out.print("A" + i + j + " ");
                }
            }
            System.out.println();
        }
    }
}
