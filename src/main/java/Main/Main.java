package Main;

import model.Candy;
import model.Snacks;
import model.Soda;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Soda soda = new Soda(1, 1, "Coca Cola");
        Candy candy = new Candy(2, 2, "Snickers");
        Snacks snacks = new Snacks (3, 3, "Chips");
        String examineResult = candy.examine()+ soda.examine()+ snacks.examine();
        String useResult = candy.use()+ soda.use()+ snacks.use();


        System.out.println("                Welcome to the Vending Machine!");
        System.out.println("                            Selections");
        System.out.println(" " + examineResult);
        System.out.println(" "+ useResult);
        int choice = 0;
        while (choice != 4) {

            System.out.println("                Please select an option:");
            System.out.println("1. Candy");
            System.out.println("2. Soda");
            System.out.println("3. Snacks");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You bought Candy!");
                    break;
                case 2:
                    System.out.println("You bought Soda!");
                    break;
                case 3:
                    System.out.println("You bought Snacks!");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
