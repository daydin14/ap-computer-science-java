package SalesAndQuizes;

/**
 * Created by David
 */
import java.util.Scanner;

public class Quizes {

    public static void main(String[] args) {
        int qs;

        Scanner keyboard = new Scanner(System.in);
        //Part 1
        System.out.print("How many questions are in the quiz?");
        qs = keyboard.nextInt();

        //Part 2
        System.out.println("Enter a key for the quiz");
        int[] answers = new int[qs];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = keyboard.nextInt();
        }

        //Part 3
        System.out.println("Enter answers for the quiz to be graded");
        int[] quiz = new int[qs];
        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = keyboard.nextInt();
        }

        //Part 4
        int numOfCorrect = 0;
        for (int i = 0; i < answers.length; i++) {
            if (quiz[i] == answers[i]) {
                numOfCorrect++;
            }
        }
        System.out.println("Number of Correct answers on the quiz is: ");
        System.out.println(numOfCorrect);
    }
}
