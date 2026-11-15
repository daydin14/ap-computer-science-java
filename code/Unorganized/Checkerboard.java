/**
 * Created by 16aydind on 12/14/2015.
 */
public class Checkerboard
{
    public static void main(String[] args)
    {
        for (int row = 1; row <= 7; row++)
        {
            System.out.print("#");
            for (int col = 1; col <= 3; col++)
            {
                System.out.print(0);
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

// try modules and if else