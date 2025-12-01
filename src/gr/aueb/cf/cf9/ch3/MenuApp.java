package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.print("Please select one of the below");
            System.out.println("1. Insert application");
            System.out.println("2. Delete application");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        } while (choice !=3);

        System.out.println("Thanks for using the program");
    }
}
