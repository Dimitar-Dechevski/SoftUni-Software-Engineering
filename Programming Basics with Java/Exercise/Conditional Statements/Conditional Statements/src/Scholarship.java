import java.util.Scanner;

public class Scholarship {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());
        double socialScholarship;
        double scholarship;

        if (grade <= 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (grade > 4.50 && grade < 5.50) {
            if (salary <= minimalSalary) {
                socialScholarship = Math.floor(minimalSalary * 0.35);
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else {
            if (salary <= minimalSalary) {
                socialScholarship = Math.floor(minimalSalary * 0.35);
                scholarship = Math.floor(grade * 25);
                if (socialScholarship <= scholarship) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarship);
                } else {
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                }
            } else {
                scholarship = Math.floor(grade * 25);
                System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarship);
            }
        }

    }
}
