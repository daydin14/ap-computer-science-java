
import java.util.Scanner;

/**
 * Created by David on 12/2/2015.
 *
 * Use a while loop to print many messages declaring your passion for computer
 * science 1. Instead of using constant LIMIT, ask the user how many times the
 * message should be printed. You will need to declare a variable to store the
 * user's response and use that variable to control the loop. (Remember that all
 * caps is used only for constants!)
 *
 * 2. Number each line in the output, and add a message at the end of the loop
 * tha says how many times the message was printed. So if the user enters 3,
 * your program should print this:
 *
 * 1 I love Comp Sci!! 2 I love Comp Sci!! 3 I love Comp Sci!! Printed this
 * message 3 times.
 *
 * 3. If the message is printed N times, compute and print the sum of the
 * numbers from 1 to N. So for the example above, the last line would now read:
 *
 * Printed this message 3 times. The sum of the numbers from 1 to 3 is 6
 *
 * Note that you will need to add a variable to hold the sum.
 */
public class LoveCS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LIMIT = 10;
        int count = 1;
        int sum = 0;

        System.out.println("How many times should the message be printed?");
        int times = sc.nextInt();
        while (count <= LIMIT) {
            LIMIT = times;
            if (times == 0) {
                count = 0; 
            }else {
                sum += count;
                System.out.println(count + " " + "I love Computer Science!!");
            }
            count++;
        }
        System.out.println("Printed this message " + (count - 1) + " times");
        System.out.println("The sum is " + sum);
    }
}
