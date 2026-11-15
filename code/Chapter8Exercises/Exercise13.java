package Chapter8Exercises;

/**
 * Created by David on 1/13/2016.
 */
public class Exercise13 {

    public static boolean beginsWith(String str, String prefix) {
        str = str.substring(0, prefix.length());
        return prefix.equalsIgnoreCase(str);
    }

    public boolean endswith(String str, String suffix) {
        str = str.substring(str.length() / 2);
        return suffix.equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        System.out.println(beginsWith("", ""));
    }
}

// public boolean startsWith (String prefix)
// {
//     return indexOf (prefix) == 0;
// }
// public boolean endsWith (String suffix)
// {
//     int pos = length() - suffix.length();
//     return pos >= 0 && lastIndexOf (suffix) == pos;
// }
// or
// public boolean startsWith (String prefix)
// {
//     int n = prefix.length();
//     return n <= length() && substring (0, n).equals(prefix);
// }
// public boolean endsWith (String suffix)
// {
//     int pos = length() - suffix.length();
//     return pos >= 0 && substring (pos).equals(suffix);
// }
