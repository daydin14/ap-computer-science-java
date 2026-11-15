/**
 * Created by David on 11/18/2015.
 */
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("How many times do you want to calculate numbers today?");
        int times = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= times; i++)
        {
            System.out.println("Hey what's good");
            System.out.println("Please enter the first number");
            double first = sc.nextDouble();  //Read in and store the first number
            System.out.println("Please enter the second number");
            double second = sc.nextDouble();  //Read in and store the second number
            //System.out.println(" What operation do you want to do? " + "type a for Addition, s for Subtraction " +
            //                   "m for Multiplication, d for Division "+ "or r for Remainder");
            //Read and store operation
            //char op = sc.next().charAt(0);
            //Now we do a bunch of nested if else statements to check for the operation
            System.out.println("Enter your choice of operation" + "\n" + " 1 = Addition"
                    + "\n" + " 2 = Subtraction"
                    + "\n" + " 3 = Multiplication"
                    + "\n" + " 4 = Division"
                    + "\n" + " 5 = Remainder");
            int operation = sc.nextInt();

            if (operation == 1)
            {
                System.out.println(first + second);
                count ++;
            }
            else if (operation == 2)
            {
                System.out.println(first - second);
                count++;
            }
            else if (operation == 3)
            {
                System.out.println(first * second);
                count++;
            }
            else if (operation == 4)
            {
                System.out.println(first / second);
                count++;
            }
            else if (operation == 5)
            {
                System.out.println(first % second);
                count++;
            }
            else
                System.out.println("You better pick an operation boy or else");

            System.out.println("Would you like to continue?" + "\n" + " 1 = Yes" + "\n" + " 2 = No");
            int cont = sc.nextInt();
            if (cont == 1)
                System.out.println("Continue we shall");
            else
            {
                System.out.println("Heading home early");
                i = times + 1;
            }
            System.out.println("Total times used so far = " + count);
        }
                System.out.println("GAME OVER Thanks for playing");
    }
}
