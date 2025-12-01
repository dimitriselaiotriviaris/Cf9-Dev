package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class NumberExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;

        System.out.println("Please enter a number: ");
        //inputStr = scanner.nextLine();
        while (!isInteger(inputStr = scanner.nextLine())){
            System.out.println("The characters are not valid");
        }
        num = Integer.parseInt(inputStr);
        System.out.println("The number is: " + num);
    }

    /**
     * Checks if the given string is an integer.
     * @param str   the string to check.
     * @return      true if the string is an integer, false otherwise.
     */
    public static boolean isInteger(String str){
        return str.matches("-?[0-9]+");
    }
}
