//****************************************************************

/*     Program Author:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Problem 1 - Week 1, 2                 */

//****************************************************************

import java.util.Scanner; /* Scanner is in the java.util package */

class Problem1 {

    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // Prompt User to input integer
        System.out.print("Input first number: ");

        // create variable = user input
        int firstInt = input.nextInt();

        // Prompt User to input integer
        System.out.print("Input second number: ");

        // create variable = user input
        int secondInt = input.nextInt();

        System.out.println();
        System.out.println("******************************* I LOVE ***");

        // print out sum, product, average, remainder
        System.out.println(firstInt + " + " + secondInt + " = " + firstInt + secondInt);
        System.out.println(firstInt + " * " + secondInt + " = " + firstInt * secondInt);
        System.out.println(firstInt + " / " + secondInt + " = " + firstInt / secondInt);
        System.out.println(firstInt + " % " + secondInt + " = " + firstInt % secondInt);

        System.out.println("********************************** JAVA **");
        System.out.println();

    }

}