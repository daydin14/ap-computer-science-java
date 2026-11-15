package Chapter8Exercises;

import java.util.Scanner;

/**
 * Created by David on 1/11/2016.
 */
//Chapter 8 Exercises #3,5,7,11
public class Exercises {

    private String firstlast;
    private String ccNumber;
    private String str2;
    private String ss;
    private String digits;

    public String convertName(String last, String first) {
        firstlast = first + last;
        return firstlast;
    }

    public String removeDashes(String sscode) {
        digits = ss.replaceAll(" ", "");
        return digits;
    }

    public String cutOut(String s, String s2) {
        int n = s.indexOf(s2);
        if (n >= 0) {
            s = s.substring(0, n) + s.substring(n + s2.length());
        }
        return s;
    }

    /**
     * public String cutOut(String str) { str2 = str.substring(0,1) +
     * str.substring(5); return str2;
    }*
     */
    public static void main(String[] args) {
        //ConvertName
        String first = "John ";
        String last = "von Neumann";
        Exercises convertname = new Exercises();
        System.out.println(convertname.convertName(last, first));

        //CreditCard
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your credit card number");
        String ccNumber = keyboard.nextLine();
        if (ccNumber != "4111 1111 1111 1111") {
            ccNumber = "4111 1111 1111 1111";
        }
        System.out.println("Having changed your credit card number to 4111 1111 1111 1111; ");
        String last4 = ccNumber.substring(15);
        System.out.println("The last four digits of the credit card number is: ");
        System.out.print(last4);

        //Remove
        Exercises remove = new Exercises();
        String str = "Hi-ho, hi-ho";
        //System.out.println(remove.cutOut(str));

        //Social Security
        Exercises social = new Exercises();
        String sscode = keyboard.nextLine();
        System.out.println(social.removeDashes(sscode));
    }
}
