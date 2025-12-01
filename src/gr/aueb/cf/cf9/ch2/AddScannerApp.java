package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class AddScannerApp {

    public static void main(String[] args) {

        //initialize variables
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //commands
        System.out.println("Please insert two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        //outputs
        System.out.printf("The sum of %d and %d is equal %d%n", num1, num2, sum);
    }
}
