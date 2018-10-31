//************************************************************************

/*     Program Author:    Robert Resendez                               */
/*         Class Name:    CO-SCI 290 Java Programming                   */
/*      Course Lesson:    Week7 Labwork 3                               */

/*        Discription:    Showing Do While Loop for Last problem        */

//************************************************************************

import java.util.Scanner;
public class sumProductDoWhileLoop {

    // scanner object
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // variable declaration
        int sum = 0, num = 0, count = 0, avg = 0;
        int max = -99, min = -99;

        // prompt user for values
        System.out.println("Enter number type -99 to stop");
        num = input.nextInt();

        // assign values to num
        min = num;
        max = num;

        // do while loop
        do {
            System.out.println("You entered: " + num);
            sum = sum + num;
            count++;

            if(num > max)
                max = num;
            if(num < min)
                min = num;

            System.out.println("Enter numbers type -99 to stop");
            num = input.nextInt();
        }while(num != -99);

        // printf for specific number of decimal places
        System.out.printf("Sum: " + sum +"\t Average: %.2f", (double)sum / count);
        System.out.println("\t largest number is: " + max + "\t Smallest number is: " + min);

    }
}
