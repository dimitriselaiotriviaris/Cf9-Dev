package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight in kilograms and the program calculates
 * the weight in grams.
 */

public class KiloToGrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weightInKilograms = 0;
        int weightInGrams = 0;
        final int KILOGRAMS_TO_GRAMS = 1000;

        System.out.println("Please give the weight in kilos");
        weightInKilograms = scanner.nextInt();
        weightInGrams = weightInKilograms * KILOGRAMS_TO_GRAMS;

        System.out.printf("The weight of %d grams in kilos is: %,d grams", weightInKilograms, weightInGrams);
    }
}
