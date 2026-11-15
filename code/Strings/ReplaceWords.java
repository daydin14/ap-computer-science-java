package Strings;

import java.util.Scanner;

/**
 * Created by David on 1/4/2016.
 */
public class ReplaceWords {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a sentence below.");
        String s1 = keyboard.nextLine();

        //System.out.println(s1);   self check for statement
        System.out.println("Please enter one word from the sentence above.");
        String s2 = keyboard.nextLine();

        //System.out.println(s2);   self check for first word
        System.out.println("Please enter a new word to replace the previously chose word.");
        String s3 = keyboard.nextLine();

        //System.out.println(s3);   self check for new word
        String s4 = s1.replaceAll(s2, s3);
        System.out.println(s4); //prints final

    }
}
