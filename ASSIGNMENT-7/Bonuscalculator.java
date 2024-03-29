import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year of joining: ");
        int joinYear = scanner.nextInt();

        int yearsOfService = currentYear - joinYear;

        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have served more than 5 years. You will receive a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Congratulations! You have served between 3 and 5 years. You will receive a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, you are not eligible for a bonus as your years of service are less than 3.");
        }

        scanner.close();
    }
}
