/**
 * Created by David on 12/7/2015.
 */
import java.util.Scanner;
public class HighLowGame2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many times would you like to play?");
        int times = sc.nextInt();
        while (times > 0)
        {
            System.out.println("Guess a number 0 through 10 bro");
            int n = sc.nextInt();
            int winningNum = (int) (Math.random() * 10);
            while (n != winningNum)
            {
                if (n >= winningNum) {
                    System.out.println("Try Again Guess Lower");
                } else if (n <= winningNum) {
                    System.out.println("Try Again Guess Higher");
                    n = sc.nextInt();
                } else
                    System.out.println(winningNum);
            } //end of inner while

            if ( n == winningNum)
            {
                System.out.println("Congratulations mate you won!");
                System.out.println(winningNum);
            }

            System.out.println("Would you like to play again?" + "\n" + "1 = Yes" + "\n" + "2 = No");
            int cont = sc.nextInt();
            if (cont == 1)
                System.out.println("Woohoo let's play some more");
            else
            {
                System.out.println("Saiyonora brotha");
                times = 0;
            }
        }
    }
}