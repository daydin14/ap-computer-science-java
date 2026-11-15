
/**
 * Created by David on 12/13/2015.
 */
public class TwiceThePorn {

    public static void main(String[] args) {
        int x, y;
        int times = 1;
        String str = "X";

        for (x = 10; x >= times; x--) {
            for (y = 1; y <= x; y++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
