
/**
 * Created by David on 12/13/2015.
 */

public class StarTree {

    public static void printStarTriangle(int numOfChars, char desireChars) {
        int row = 1;
        while (row <= numOfChars) {
            for (int n = numOfChars; n >= row; n--) {
                System.out.print(desireChars + " ");
            }
            System.out.println();
            row++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StarTree Tree = new StarTree();
        System.out.println(Tree.printStarTriangle(4, 'x'));
    }
}
