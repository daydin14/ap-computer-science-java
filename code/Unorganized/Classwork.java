
/**
 * Created by David on 1/19/2016.
 */
public class Classwork {

    public static String process(String msg, String delim) {
        int pos = msg.indexOf(delim);
        while (pos >= 0) {
            msg = msg.substring(0, pos) + " " + msg.substring(pos + delim.length());
            pos = msg.indexOf(delim);
        }
        return msg;
    }

    public static void main(String[] args) {
        String rhyme = "Twinkle\ntwinkle\nlittle star";
        String rhyme2 = process(rhyme, "\n");
        System.out.println(rhyme + "\n" + rhyme2);
    }
}
