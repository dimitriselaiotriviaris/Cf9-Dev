package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please insert a temperature");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("The temperature is lower than 0: " + isTempBelowZero);
    }
}
