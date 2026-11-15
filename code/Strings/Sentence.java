package Strings;
import java.util.Scanner;
/**
 * Created by David on 1/3/2016.
 */
public class Sentence
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a sentence below.");
        String s1 = keyboard.nextLine();

        System.out.println(s1);

        int vowels = 0;

        for (int n = 0; n <= s1.length() - 1; n++)
        {
            char ch = s1.charAt(n);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
        }
        System.out.println("The amount of vowels within this sentence is: " + vowels);
    }
}
