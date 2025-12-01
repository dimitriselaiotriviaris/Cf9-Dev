package gr.aueb.cf.cf9.ch2;

public class OverflowApp {
    public static void main(String[] args) {
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        result = num1 + num2;

        System.out.println("The result is: " + result);
    }
}
