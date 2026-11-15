
/**
 * Created by David on 12/8/2015.
 */
public class BottlesOfBeer {

    public static void main(String[] args) {
        int n = 99;
        while (n >= 94) {
            System.out.println(n + " bottles of beer on the wall"
                    + "\n" + n + "bottles of beer"
                    + "\n" + "take one down pass it around "
                    + "\n" + (n - 1) + " bottles of beer on the wall");
            n--;
        }
    }
}
