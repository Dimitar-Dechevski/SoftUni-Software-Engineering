import java.util.Scanner;

public class AnimalType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        if (animal.equals("dog")) {
            System.out.println("mammal");
        } else if (animal.equals("snake") || animal.equals("tortoise") || animal.equals("crocodile")) {
            System.out.println("reptile");
        } else {
            System.out.println("unknown");
        }


    }
}
