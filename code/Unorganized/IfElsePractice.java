/**
 * Created by David on 11/04/2015.
 */
public class IfElsePractice
{
    public static void main(String[] args)
    {
        int grade = 69;

        if (grade >= 95)
        {
            System.out.println("You have an A");
        }
        else if (grade > 80 && grade < 95)
            {
                System.out.println("You got a B ");
            }
        else if (grade > 70 && grade < 80)
            {
                System.out.println("You just passed");
            }
        else if (grade < 70)
            {
                System.out.println("You f-ing FAIL");
            }
    }
}
