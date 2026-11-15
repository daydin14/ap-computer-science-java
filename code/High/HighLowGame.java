/**
 * Created by David on 12/4/2015.
 */
package High;

import java.util.Scanner;

public class HighLowGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number 0 through 10 bro");
        int n = sc.nextInt();
        int winningNum = (int) (Math.random() * 10);

        while (n != winningNum) {
            if (n >= winningNum) {
                System.out.println("Try Again Guess Lower");
                n = sc.nextInt();
            } else if (n <= winningNum) {
                System.out.println("Try Again Guess Higher");
                n = sc.nextInt();
            } else {
                System.out.println((int) winningNum);
            }
        }
        System.out.println("Congratulations mate you won");
        System.out.println(winningNum);
    }
}
