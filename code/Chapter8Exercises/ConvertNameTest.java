package Chapter8Exercises;

/**
 * Created by David on 1/11/2016.
 */
public class ConvertNameTest {

    String first, last;

    public static void main(String[] args) {
        String first = "John ";
        String last = "von Neumann";
        Converting test = new Converting();
        System.out.println(test.convertName(last, first));
    }
}
