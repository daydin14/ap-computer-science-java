/**
 * Created by David on 12/8/2015.
 */
package Unorganized;

public class Beer {

    public static void main(String[] args) {
        for (int n = 99; n >= 94; n--) {
            System.out.println(n + " bottles of beer on the wall"
                    + "\n" + n + "bottles of beer"
                    + "\n" + "take one down pass it around "
                    + "\n" + (n - 1) + " bottles of beer on the wall");
        }
    }
}
