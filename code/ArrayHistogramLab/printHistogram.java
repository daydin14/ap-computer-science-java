package ArrayHistogramLab;

import java.util.Scanner;

/**
 * Created by David on 3/4/2016.
 */
public class printHistogram {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Starting from 0, what is the range of the scores?");
        int range = kb.nextInt();

        int[] count = new int[range + 1]; //Creates an array of empty spots // keeps track of occurrences

        System.out.println("Please enter scores within the range");
        System.out.println("If your done inputting scores enter -1. ");

        int occurrences = 0;
        for (int i = 0; i != -1; i++) {
            int score = kb.nextInt();

            if (score != -1) {
                count[score]++;
                occurrences++;
            } else if (score == -1) {
                break;
            }
        }
        System.out.println("Score   #Occurrences");
        for (int i = 0; i <= range; i++) {
            System.out.println(i + "\t\t\t" + count[i]);
        }

        System.out.println("The total occurrences is: " + occurrences);

        // part 2
        System.out.println("Score   #Occurrences");
        for (int i = 0; i <= range; i++) {
            System.out.print(i + "\t\t\t");
            for (int k = 0; k < count[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
