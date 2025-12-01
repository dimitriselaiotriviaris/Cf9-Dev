package gr.aueb.cf.cf9.ch6;

public class ArraySymmetric {

    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr){
        //boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--)
            if (arr[i] != arr[j]){
                //isSymmetric = false;
                //break;
                return false;
            }
        //return isSymmetric;
        return true;
    }
}
