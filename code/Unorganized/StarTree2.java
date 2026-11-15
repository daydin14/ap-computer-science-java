
/**
 * Created by David on 12/14/2015.
 */
public class StarTree2 {

    public static void printStarTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            int col = 1;
            while (col <= n - row) {
                System.out.print(" ");
                col++;
                while (col < n + row) {
                    System.out.print("*");
                    col++;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        StarTree2 tree = new StarTree2();
        // System.out.println(printStarTriangle(2));
        // System.out.print(tree.printStarTriangle(2));
    }
}
