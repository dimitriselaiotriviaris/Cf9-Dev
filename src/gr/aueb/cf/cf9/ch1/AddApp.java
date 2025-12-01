package gr.aueb.cf.cf9.ch1;

public class AddApp {

    public static void main(String[] args) {

        //variables initialization
        int num1 = 500_000;
        int num2 = 10_000;
        int result = 0;

        //commands
        result = num1 + num2;

        //print result
        System.out.println("The result is: " + result);
        System.out.println("The sum of: " + num1 + ", " + num2 + " is: " + result);
        System.out.printf("The sum of: %,d, %,d is: %,d\n", num1, num2, result);
    }

}
