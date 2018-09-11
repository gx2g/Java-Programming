//****************************************************************

/*     Program Author:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Problem 3 - Week 1, 2                 */

//****************************************************************

import java.util.Scanner; /* Scanner is in the java.util package */

class Problem3 {

    public static void main(String[] args) {

        // Variable Decloration
        int acceleration = 32;

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println();
        // Prompt the user to enter a radius
        System.out.print("Enter time in Seconds: ");
        // user input assigned to time variable
        int time = input.nextInt();

        // distance variable = math formula to calulate free fall distance
        int distance = acceleration * (time * time) / 2;

        System.out.println();
        System.out.println("***************************** I love ****");

        // print out statement using + concat to break up statement
        System.out.println("If an Object was falling for " + time + " seconds.\n"
                              + "The Object would fall " + distance + " feet. ");

        System.out.println("********************************* java **");
        System.out.println();

    }
}