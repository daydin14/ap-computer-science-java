package Strings;

/**
 * Created by David on 12/22/2015.
 */
public class QuickBrownFox {

    public static void main(String[] args) {
        String phrase = "Quick Brown Fox";

        int len = phrase.length();
        System.out.println("Length of phrase: " + len);

        String firstPart = phrase.substring(0, 9);
        System.out.println(firstPart);

        String upper = firstPart.toUpperCase();
        System.out.println(upper);

        int whereC = phrase.indexOf("c");
        System.out.println("c is at location: " + whereC);

        String b = "";
        for (int x = len - 1; x >= 0; x--) {
            b += phrase.charAt(x);
        }
        System.out.println(b);

        if (phrase.equals("Quick Brown Fox")) {
            System.out.println("jumped over the lazy dog"); 
        }else {
            System.out.println("went home to bed");
        }

        System.out.println(phrase.replaceAll("Fox", "dog"));
    }
}
