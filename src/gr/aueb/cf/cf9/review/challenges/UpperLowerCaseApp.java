package gr.aueb.cf.cf9.review.challenges;


import java.util.Scanner;

public class UpperLowerCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputStr = "";
        char ch = ' ';

        // Insertion of data
        System.out.println("Please insert a string");
        inputStr = scanner.nextLine();

        // Process - Business
        for (int i = 0; i < inputStr.length(); i++){
            ch = inputStr.charAt(i);
            if (Character.isLetter(ch)){
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
