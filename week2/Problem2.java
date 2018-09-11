//****************************************************************

/*     Program Author:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Problem 2 - Week 1, 2                 */

//****************************************************************

import java.util.Scanner; /* Scanner is in the java.util package */

class Problem2 {

    public static void main(String[] args) {

        // variable declaration
        int quarters;   // variable quarters
        int dimes;      // variable dimes
        int nickels;    // variable nickels

        // create an object of type Scanner
        Scanner input = new Scanner(System.in);

        System.out.println();

        // prompt user for number of quarters
        System.out.print("  Enter the number of quarters:  ");
        // assign user input value to quarters variable
        quarters = input.nextInt();

        // prompt user for number of dimes
        System.out.print("  Enter the number of dimes:     ");
        // assign user input value to dimes variable
        dimes = input.nextInt();

        // prompt user for number of nickels
        System.out.print("  Enter the number of nickels:   ");
        // assign user input value to nickels variable
        nickels = input.nextInt();

        // variable declaration for math equations
        int totalQuarters = (quarters * 25);
        int totalDimes = (dimes * 10);
        int totalNickels = (nickels * 5);

        // varaible assign with math equation calulations
        int totalCents = totalQuarters + totalDimes + totalNickels;

        System.out.println();
        System.out.println("***************************** I love ****");

        // statement output totalCents variable
        System.out.println("  Coins are worth " + totalCents + " cents");

        System.out.println("********************************* java **");
        System.out.println();

    }
}
