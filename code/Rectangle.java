import java.util.Scanner;
/**
 * Created by David on 3/23/2016.
 */
public class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    public double getLength(){return length;}
    public double getWidth(){return width;}
    public double getArea(){return length * width;}
    public double getPerimeter(){return (2 * length) + (2 * width);}

    public static void main(String[] args)
    {
        System.out.println("How many rectangles would you like to create?");

        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();

        double [] lengths = new double[count];
        double [] widths = new double[count];
        Rectangle [] rectangles = new Rectangle[count];
        //double [] lengths = new double[count]; double [] widths = new double [count]; Rectangle [] rectangles = new Rectangle[count]; //WOULD STILL WORK!!!!!!!!

        for (int i = 0; i < count; i++)
        {
            System.out.println("What is the length of the rectangle?");
            lengths [i] = kb.nextDouble();
            System.out.println("What is the width of the rectangle?");
            widths [i] = kb.nextDouble();

            Rectangle rec = new Rectangle(lengths[i],widths[i]);
            rectangles [i] = rec;
        }

        System.out.println("Rectangle" + "\t" + "Length" + "\t" + "Width" + "\t" + "Area" + "\t" + "Perimeter");
        for (int i = 0; i < rectangles.length; i++)
        {
            System.out.println("R" + (i+1) + "\t" + "\t" + "\t"+ rectangles[i].getLength() + "\t" + rectangles[i].getWidth() + "\t" + "\t" + rectangles[i].getArea() + "\t" + rectangles[i].getPerimeter());
        }
    }
}
