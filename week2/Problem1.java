//****************************************************************

/*     Program Author:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Problem 1 - Week 1, 2                 */

//****************************************************************

import java.util.Scanner; /* Scanner is in the java.util package */

class Problem1 {

    public static void main(String[] args) {

        /* create object of Scanner */
        Scanner input = new Scanner(System.in);

        /* Prompt User to input integer */
        System.out.print("Input 1st integer: ");

        /* create variable = user input */
        int firstInt = input.nextInt();

        /* Prompt User to input integer */
        System.out.print("Input 2nd integer: ");

        /* create variable = user input */
        int secondInt = input.nextInt();

        /* print out sum, product, average, remainder */
        System.out.println("******************************* I LOVE ***");
        System.out.printf(" (Sum) of two integers: %d%n", firstInt + secondInt);
        System.out.printf(" (Product) of two integers: %d%n", firstInt * secondInt);
        System.out.printf(" (Average) of two integers: %d%n", firstInt + secondInt / 2);
        System.out.printf(" (Remainder) of two integers: %d%n", firstInt % secondInt);
        System.out.println("********************************** JAVA **");
    }

}