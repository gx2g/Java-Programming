//****************************************************************

/*     Program Author:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Week6 Labwork 2                       */
/*        Discription:    This program takes two integers       */
/*                        and gives the Sum, Average, and       */
/*                        Remainder                             */

//****************************************************************

import java.util.*;
import java.io.*;


public class week6Labwork2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
       char answer;


        do {

            System.out.println("Enter two Numbers: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            System.out.println("Their sum is " + calculateSum(number1, number2));
            System.out.println("Their average is " + calculateAverage(number1, number2));
            System.out.println("Their remainder is " + calculateRemainder(number1, number2));

            System.out.println("Do you want to run this again? enter y for yes or any key to quit");
            answer = input.next().charAt(0);

        } while(answer == 'Y' || answer == 'y');

        System.exit(0);
    }


    public static int calculateSum(int num1, int num2){

        int sum;
        sum = num1 + num2;
        return sum;

    }
    public static int calculateAverage(int num1, int num2){

        int average;
        average = (num1 + num2) / 2;
        return average;

    }
    public static int calculateRemainder(int num1, int num2){

        int remainder;
        remainder = num1 % num2;
        return remainder;

    }
}