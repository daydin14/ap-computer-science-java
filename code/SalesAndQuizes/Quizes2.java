package SalesAndQuizes;

/**
 * Created by David
 */
import java.util.Scanner;

public class Quizes2 {

    public static void main(String[] args) {
        int qs;
        int numQuizes;
        int j = 0;
        String start;

        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);

        System.out.println("Would you like to grade quizzes?");
        start = keyboard.nextLine();
        if (start.equalsIgnoreCase("no")) {
            keyboard.close();
            keyboard2.close();
        }
        while (start.equalsIgnoreCase("yes")) {
            //Part 5
            System.out.println("How many quizes do you want to grade?");
            numQuizes = keyboard.nextInt();

            System.out.println();
            /*Break up Beginning of Part 5 and Part 1 **/

            //Part 1
            System.out.println("How many questions are in this quiz?");
            qs = keyboard.nextInt();

            //Part 2
            System.out.println("Enter an answer key for the quiz");
            int[] answers = new int[qs];
            for (int i = 0; i < answers.length; i++) {
                answers[i] = keyboard.nextInt();
            }
            while (j < numQuizes) {
                //Part 3
                System.out.println("Enter a student's set of answers for the quiz to be graded");
                int[] quiz = new int[qs];
                for (int i = 0; i < quiz.length; i++) {
                    quiz[i] = keyboard.nextInt();
                }

                //Part 4
                int numOfCorrect = 0;
                double percent = 0.0;
                for (int i = 0; i < answers.length; i++) {
                    if (quiz[i] == answers[i]) {
                        numOfCorrect++;
                    }
                }

                percent = ((numOfCorrect + 0.00) / (answers.length + 0.00)) * 100.00;
                System.out.println("Number of Correct answers on the quiz is: " + numOfCorrect);
                //System.out.print(numOfCorrect);

                System.out.println();

                System.out.println("The percent correct is: " + percent + "%");
                //System.out.print(percent + "%");

                System.out.println();

                System.out.println("Would you like to grade another quiz? Yes or No?");
                String s = keyboard2.nextLine();

                if (s.equalsIgnoreCase("yes")) {
                    System.out.println("Woohoo lets continue");
                } else {
                    start.equalsIgnoreCase("no");
                    break;
                }
                System.out.println();

                //Part 5 Increment
                j++;
            }
        }
    }
}
