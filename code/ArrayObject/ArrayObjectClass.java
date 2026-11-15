package ArrayObject;

public class ArrayObjectClass {

    private String name;
    private int age;

    public ArrayObjectClass(String nme, int age1) {
        name = nme;
        age = age1;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " " + age;
    }

}
