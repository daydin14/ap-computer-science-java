package Chapter8Exercises;

import java.util.Scanner;

/**
 * Created by David on 1/11/2016.
 */
public class CreditCard {

    public static void main(String[] args) {
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

    }
}
