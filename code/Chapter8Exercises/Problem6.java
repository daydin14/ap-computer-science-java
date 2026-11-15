package Chapter8Exercises;

import java.util.Scanner;

/**
 * Created by David on 1/12/2016.
 */
public class Problem6 {

    public String scroll(String s) {
        s = s.substring(1) + s.substring(0, 1);
        return s;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What word would you like to move the first letter to the end?");
        String s = keyboard.nextLine();
        System.out.println(s + " to: ");
        Problem6 word = new Problem6();
        System.out.println(word.scroll(s));
    }
}
