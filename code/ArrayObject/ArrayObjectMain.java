package ArrayObject;

import java.util.Scanner;

public class ArrayObjectMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanWord = new Scanner(System.in);
        ArrayObjectClass first = new ArrayObjectClass("Jim", 24);
        ArrayObjectClass second = new ArrayObjectClass("second", 24);
        ArrayObjectClass[] arrObj = new ArrayObjectClass[10];
        ArrayObjectClass[] otherArrObj = new ArrayObjectClass[5];

        //Manual way to fill the array very annoying
        arrObj[0] = first;
        arrObj[1] = second;

        //print the array
        for (int i = 0; i < 10; i++) {
            System.out.print(arrObj[i].toString() + "    ");
        }

        //Fill the are with a loop
        String name = "";
        int age = 0;
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the Name ");
            name = scanWord.nextLine();
            System.out.print("Enter the age ");
            age = scanInt.nextInt();
            otherArrObj[i] = new ArrayObjectClass(name, age);
        }

        //print the array
        for (int i = 0; i < 5; i++) {
            System.out.print(otherArrObj[i] + "    ");
        }

        for (ArrayObjectClass a : arrObj) {
            System.out.print(a);
        }

        scanInt.close();
        scanWord.close();

    }

}
