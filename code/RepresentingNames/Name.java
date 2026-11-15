package RepresentingNames;

/**
 * Created by David on 1/4/2016.
 */
public class Name {

    private String f;
    private String m;
    private String l;
    private String inF;
    private String inM;
    private String inL;

    public Name(String first, String middle, String last) {
        f = first;
        m = middle;
        l = last;
    }

    public String getFirst() {
        return f;
    }

    public String getMiddle() {
        return m;
    }

    public String getLast() {
        return l;
    }

    public String firstMiddleLast() {
        return f + " " + m + " " + l;
    }

    public String lastFirstMiddle() {
        return l + " " + f + " " + m;
    }

    public boolean equals(Name otherName) {
        return firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());
    }

    public String initials() {
        inF = f.substring(0, 1);
        inM = m.substring(0, 1);
        inL = l.substring(0, 1);
        return inF + "." + inM + "." + inL + ".";
        // could do
        // initials = f.substring(0) + m.substring(0) + l.substring(0);
    }

    public int length() {
        return firstMiddleLast().length() - 2;
        // return firstMiddleLast(2).length();
    }
}
