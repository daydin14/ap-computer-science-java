package Chapter8Exercises;

import java.util.Scanner;

/**
 * Created by David on 1/11/2016.
 */
public class SocialTest {

    public static void main(String[] args) {
        SocialSecurity social = new SocialSecurity();
        Scanner keyboard = new Scanner(System.in);
        String sscode = keyboard.nextLine();
        System.out.println(social.removeDashes(sscode));
    }
}
