//****************************************************************

/*          CopyRight:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Problem 1,2,3 - Week 1,2              */
/*               Note:    All Problems Combined using Methods   */

//****************************************************************

import java.util.Scanner;

public class Problem123 {

    public static void main(String[] args) {

        ProblemOne(); // calling method 1
        ProblemTwo(); // calling method 2
        ProblemThree(); // calling method 3

        System.exit(0);

    } // main method

    // Problem 1 Method
    public static void ProblemOne() {

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

    // Problem 2 Method
    public static void ProblemTwo() {

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

    // Problem 3 Method
    public static void ProblemThree() {

        // Variable Decloration
        final int ACCELERATION = 32;

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println();
        // Prompt the user to enter a radius
        System.out.print("Enter time in Seconds: ");
        // user input assigned to time variable
        int time = input.nextInt();

        // distance variable = math formula to calulate free fall distance
        int distance = ACCELERATION * (time * time) / 2;

        System.out.println();
        System.out.println("***************************** I love ****");

        // print out statement using + concat to break up statement
        System.out.println("If an Object was falling for " + time + " seconds.\n"
                + "The Object would fall " + distance + " feet. ");

        System.out.println("********************************* java **");
        System.out.println();

    }
}
