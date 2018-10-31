//************************************************************************

/*     Program Author:    Robert Resendez                               */
/*         Class Name:    CO-SCI 290 Java Programming                   */
/*      Course Lesson:    Week7 Labwork 3                               */

/*        Discription:    For a quadratic equation ax2+bx+c = 0         */
/*                        (where a, b and c are coefficients),          */
/*                        it's roots is given by the formula:           */
/*                        The value of the discriminant (b2-4ac)        */
/*                        determines the nature of roots.               */
/*                        Write a JAVA program that reads the           */
/*                        values of a, b and c from the user            */
/*                        and performs the following:-a.                */
/*                        If the value of the discriminant is           */
/*                        positive, program should print out            */
/*                        that the equation has two real roots          */
/*                        and prints the values of the two roots.       */

//************************************************************************

import java.util.Scanner;
import java.util.*;

public class printValue2Roots {

    // scanner object
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // variable declaration
        double a, b, c;
        double discri;
        double x1, x2;

        // prompt user for values
        System.out.println("Enter values for a, b and c:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // calculation
        discri = b * b - 4 * a * c;

        System.out.println("Discriminant: " + discri);

        // if == 0 do calculation
        if(discri == 0) {
            x1 = -b / ( 2 * a);
            System.out.println("Equation has equal roots");
        }

        else if(discri < 0) {
            System.out.println("Equation has complex roots");
        }

        else {
            System.out.println("Equation has 2 real roots");
            x1 = (-b + Math.sqrt(discri)) / (2 * a);
            x2 = (-b - Math.sqrt(discri)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}