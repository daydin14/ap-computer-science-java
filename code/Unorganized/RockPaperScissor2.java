/**
 * Created by David on 12/17/2015.
 */
import java.util.Scanner;
public class RockPaperScissor2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String choice = "";
        String str = "";

        System.out.println("Would you like to play Rock Paper Scissors?");
        System.out.println("Reply 1 for Yes" + "\n" + "And 2 for No");

        int game = keyboard.nextInt();

        if (game == 1)
            System.out.println("Hoo-ray lets play");
        else
        {
            System.out.println("Bye-Bye");
            return;
        }

        System.out.println("Would you like to know how to play?");
        System.out.println("1 = Yes" + "\n" + "2 = No");
        int instructions = keyboard.nextInt();
        str = keyboard.nextLine(); //eats up rest of line
        if (instructions == 1)
            System.out.println("Rock beats Scissors" + "\n" + "Paper beats Rock" + "\n" + "Scissors  beats Paper");
        else
            System.out.println("Good Luck");

        System.out.println("Would you like to play against a bot?" + "\n" + "Yes or No?");
        String bot = keyboard.nextLine();

        if (bot.equalsIgnoreCase("Yes"))
            System.out.println("Have Fun!");
        else if (bot.equalsIgnoreCase("No"))
        {
            System.out.println("Bye");
            return;
        }
        else
            System.out.println("Pick bro");

        System.out.println("How many times do you want to play?");

        int times = keyboard.nextInt();

        for (int i = 1; i <= times; i++)
        {
            System.out.println("Which would you like?" + "\n" + "1 = Rock" + "\n" + "2 = Paper" + "\n" + "3 = Scissor");

            int weapon = keyboard.nextInt();

            if (weapon == 1)
                System.out.println("Rock");
            else if (weapon == 2)
                System.out.println("Paper");
            else if (weapon == 3)
                System.out.println("Scissors");
            else
                System.out.println("Please choose a weapon for attack");

            int weapon2 = (int) (Math.random() + 1) * 3;

            if (weapon2 == 1)
                choice = "Rock";
            else if (weapon2 == 2)
                choice = "Paper";
            else if (weapon2 == 3)
                choice = "Scissor";

            System.out.println("Get Ready" + "\n" + "Rock..." + "\n" + "Paper..." + "\n" + "Scissor..." + "\n" + "Shoot!!!");

            if (weapon == 1 && weapon2 == 3 || weapon == 2 && weapon2 == 1 || weapon == 3 && weapon2 == 2)
                System.out.println("Player 1 Wins!!!");
            else if (weapon == weapon2)
                System.out.println("Tie");
            else
                System.out.println("Player 2 Wins!!!");
        }
    }
}
