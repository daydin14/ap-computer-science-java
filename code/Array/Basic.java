package Array;

/**
 * Created by David on 2/19/2016.
 */
public class Basic {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // First Array
        int len = a.length;
        int[] b = new int[len]; // Second Array
        int[] copy = new int[len]; //Copy of First Array
        int[] swap = new int[len];

        //System.out.println(a);   //prints mem location
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int j = 0; j < len; j++) {
            System.out.print(b[j] + " ");
        }

        System.out.println();

        for (int k = 0; k < len; k++) {
            copy[k] = a[k];
            System.out.print(copy[k] + " ");
        }
        System.out.print(" This is a copy of the first array");

        System.out.println();

        for (int p = 0; p < len; p++) {
            swap[p] = a[len - 1] - p;
            System.out.print(swap[p] + " ");
        }
        // Class code to print array backwards //swapped correctly
        System.out.println();

        for (int m = 0; m < len; m++) {
            for (int n = 0; n < len; n++) {
                swap[m] = a[(len - 1) - n];
            }
            System.out.print(swap[m] + " ");
        }
        // My take on printing array backwards //swapped incorrectly
    } //end of main
} //end of class
