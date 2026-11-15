package SalesAndQuizes;// ************
//David
// **********************************

import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        //int[] sales = new int[SALESPEOPLE];
        int sum;
        int averageSum;
        int maximumSale = 0;
        int minimumSale = 999999999;
        int maxSalesPerson = 0, minSalesPerson = 0;
        int id, numSalespeople = 0, value;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an amount of Salespeople: ");
        int[] sales = new int[scan.nextInt()];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + (i + 1) + "         " + sales[i]);
            sum += sales[i];

            //Part 2
            if (maximumSale < sales[i]) {
                maximumSale = sales[i];
                maxSalesPerson = i + 1;
            }
            if (minimumSale > sales[i]) {
                minimumSale = sales[i];
                minSalesPerson = i + 1;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        //Part 1 create way to compute average sales
        averageSum = sum / SALESPEOPLE;
        System.out.println("The average sum is: " + averageSum);

        //Part 2 maximumSale
        System.out.println("Sales Person: " + maxSalesPerson + " had the maximum sale of " + maximumSale);

        //Part 3 minimumSale
        System.out.println("Sales Person: " + minSalesPerson + " had the minimum sale of " + minimumSale);

        //Part 4 ID of salesperson[i] //exceeded amount//, amount of sales, num of salespeople //exceed value entered//
        System.out.print("Enter a value: ");
        value = scan.nextInt();
        //System.out.println(value); //test
        for (int i = 0; i < SALESPEOPLE; i++) {
            if (sales[i] > value) {
                numSalespeople++;
                id = i + 1;
                System.out.println("Salesperson " + id + " with an amount of: " + sales[i] + " as their sales");
            }
        }
        System.out.println("The total number of salespeople who exceeded value: " + numSalespeople);
    }
}
