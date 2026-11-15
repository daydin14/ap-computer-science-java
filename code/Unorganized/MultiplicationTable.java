
/**
 * Created by David on 12/10/2015.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int x;
        int y;

        System.out.print("X\t"); //shows x then puts you onto the next line
        for (int t = 1; t <= 10; t++) {
            System.out.print(t + "|\t");
        }
        System.out.println();
        for (x = 1; x <= 10; x++) {
            System.out.print(x + "|\t");

            for (y = 1; y <= 10; y++) {
                System.out.print((x * y) + "\t"); //horizontal
            }
            System.out.println();
        }
    }
}
