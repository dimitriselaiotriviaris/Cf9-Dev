package gr.aueb.cf.cf9.ch5;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 0;

        System.out.println("Please enter two number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        result = pow(a,b);

        System.out.println("a^b = " + result);
    }

    public  static  int pow(int a, int b){
        int result = 1;
        for (int i = 0; i< b; i++){
            result *= a;
        }
        return  result;

    }
}
