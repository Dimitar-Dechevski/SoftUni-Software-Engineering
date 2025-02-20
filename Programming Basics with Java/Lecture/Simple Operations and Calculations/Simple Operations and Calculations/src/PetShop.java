import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogs = Integer.parseInt(scanner.nextLine());
        double otherAnimals = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = dogs * 2.5;
        double otherAnimalsFoodPrice = otherAnimals * 4;
        double result = dogFoodPrice + otherAnimalsFoodPrice;

        System.out.printf("%.2f lv.", result);

    }
}
