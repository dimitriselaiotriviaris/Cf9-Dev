package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class EuroToUsdConverter {

    public static void main(String[] args) {
        //Initialize variables
        Scanner scanner = new Scanner(System.in);
        final int EURO_TO_USD_CONVERSION_RATE = 99;
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        //Data Input
        System.out.println("Please insert an amount in Euros");
        inputEuros = scanner.nextInt();

        //Data Processing - Expressions
        totalUsaCents = inputEuros * EURO_TO_USD_CONVERSION_RATE;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Data Output
        System.out.printf("%d Euros = %d USD dollars kai %d USD Cents %n", inputEuros, usaDollars, usaCents);

    }
}
