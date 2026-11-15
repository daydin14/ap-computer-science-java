package Chapter8Exercises;

/**
 * Created by David on 1/11/2016.
 */
public class Remove {

    private String str2;

    public String cutOut(String str) {
        str2 = str.substring(0, 1) + str.substring(5);
        return str2;
    }
}
