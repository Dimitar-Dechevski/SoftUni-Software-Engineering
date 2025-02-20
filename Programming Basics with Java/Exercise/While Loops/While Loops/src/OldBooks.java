import java.util.Scanner;

public class OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;

        while (count < number) {
            String book = scanner.nextLine();
            if (favouriteBook.equals(book)) {
                isFound = true;
                break;
            } else {
                count++;
            }
        }

        if (!isFound) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", number);
        } else {
            System.out.printf("You checked %d books and found it.", count);
        }

    }
}
