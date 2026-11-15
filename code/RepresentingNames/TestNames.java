package RepresentingNames;

import java.util.Scanner;

/**
 * Created by David on 1/5/2016.
 */
public class TestNames {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a first name.");
        String f = keyboard.nextLine();

        System.out.println(f);//working test

        System.out.println("Please enter a middle name.");
        String m = keyboard.nextLine();

        System.out.println(m);//working test

        System.out.println("Please enter a last name.");
        String l = keyboard.nextLine();

        System.out.println(l);//working test

        System.out.println(f + " " + m + " " + l);

        Name firstPerson = new Name(f, m, l);

        String f2 = new String();
        String m2 = new String();
        String l2 = new String();

        System.out.println("Please enter a first name.");
        f2 = keyboard.nextLine();

        System.out.println(f2);//working test

        System.out.println("Please enter a middle name.");
        m2 = keyboard.nextLine();

        System.out.println(m2);//working test

        System.out.println("Please enter a last name.");
        l2 = keyboard.nextLine();

        System.out.println(l2);//working test

        System.out.println(f2 + " " + m2 + " " + l2);

        Name secondPerson = new Name(f2, m2, l2);

        System.out.println("The first person's information is as listed below: ");
        System.out.println("The first name is: " + firstPerson.getFirst());
        System.out.println("The middle name is: " + firstPerson.getMiddle());
        System.out.println("The last name is: " + firstPerson.getLast());
        System.out.println("Full name: " + firstPerson.firstMiddleLast());
        System.out.println("Full name rewritten: " + firstPerson.lastFirstMiddle());
        System.out.println("Initials: " + firstPerson.initials());
        System.out.println("Length of name not including spaces: " + firstPerson.length());

        System.out.println("Is the first person the second person?" + "\n" + "True or False?" + "\n" + firstPerson.equals(secondPerson));

        System.out.println("The second person's information is as listed below: ");
        System.out.println("The first name is: " + secondPerson.getFirst());
        System.out.println("The middle name is: " + secondPerson.getMiddle());
        System.out.println("The last name is: " + secondPerson.getLast());
        System.out.println("Full name: " + secondPerson.firstMiddleLast());
        System.out.println("Full name rewritten: " + secondPerson.lastFirstMiddle());
        System.out.println("Initials: " + secondPerson.initials());
        System.out.println("Length of name not including spaces: " + secondPerson.length());

    }
}
