package ArrayHistogramLab;

import java.util.Scanner;

/**
 * Created by David on 3/4/2016.
 */
public class arrayLab {

    public static void main(String[] args) {
        String[] words = new String[50]; //creates a string array of 50
        int k = 0; //for while loop

        int newLen = 0;
        int av = 0;
        int newCount = 0;
        double total = 0.0;
        Scanner keyboard = new Scanner(System.in);

        while (k < 1) {
            for (int i = 0; i < words.length; i++) {
                System.out.println("Give me words for this assignment");
                words[i] = keyboard.nextLine();
                System.out.println("Would you like to continue putting in words?");
                if (keyboard.nextLine().equalsIgnoreCase("yes")) {
                    System.out.println("Continue");
                    newLen++;
                } else {
                    break;
                }
            }

            System.out.println("The data is: ");

            for (int d = 0; d <= newLen; d++) {
                System.out.print(words[d] + " ");
                av += words[d].length();
                newCount++;
            }

            total = (av * 1.0) / (newCount * 1.0); //creates average
            System.out.println();
            System.out.println("The average is: ");
            System.out.println(total);
            k++;
        }
    }
}
