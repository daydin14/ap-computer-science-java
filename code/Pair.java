
/**
 * Created by David on 3/22/2016.
 */
public class Pair {

    private double first, second;

    public Pair(double a, double b) {
        first = a;
        second = b;
    }

    public void swap1() {
        double temp = first;
        first = second;
        second = temp;
    }

    public Pair swap2() {
        return new Pair(second, first);
    }

    public String toString() {
        return "The first number is: " + first + " The second number is: " + second;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public void updateFirst(double f) {
        first = f;
    }

    public double compareFirst(Pair obj2) {
        if (this.getFirst() > obj2.getFirst()) {
            return this.getFirst(); 
        }else if (obj2.getFirst() > this.getFirst()) {
            return obj2.getFirst(); 
        }else {
            throw new IllegalArgumentException("Both objects are of equal value");
        }
    }

    public static void main(String[] args) {
        Pair obj1 = new Pair(1, 2);
        Pair obj2 = new Pair(9, 10);
        System.out.println(obj1.toString());
        System.out.println(obj2); //prints the toString too
        Pair[] arr = new Pair[10];
        arr[0] = obj1;
        arr[1] = obj2;

    }
}
