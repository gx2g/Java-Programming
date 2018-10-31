
//****************************************************************

/*     Program Author:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Week7 Labwork 3                       */
/*        Discription:    Write a JAVA program that accepts     */
/*                        an amount of money on deposit and a   */
/*                        number of years it has been on        */
/*                        deposit (years can have decimals).    */
/*                        It will determine the interest to be  */
/*                        paid on the deposit based on the      */
/*                        following schedule:                   */

//****************************************************************

import java.util.Scanner;

class moneyDeposit {
    public static void main(String[] args) {

        // variable declaration
        double deposit;
        double years;
        double interestRate = 0;
        double interest;
        double newBalance;

        // scanner object
        Scanner input = new Scanner (System.in);

        // do while loop asking for numbers
        do {
            System.out.println("Enter the deposit amount: ");
            deposit = input.nextDouble();
        } while(deposit < 0);

        // do while loop asking for numbers
        do {
            System.out.println("Enter the number of years of deposit: ");
            years = input.nextDouble();
        } while( years < 0);

        // if statement adding value to interestrate
        if(years >= 5)
            interestRate = 4.5;
        if(years < 5 && years >= 4)
            interestRate = 4;
        if(years < 4 && years >= 3)
            interestRate = 3.5;
        if(years < 3 && years >= 2)
            interestRate = 2.5;
        if(years < 2 && years >= 1)
            interestRate = 2;
        if(years < 1)
            interestRate = 1.5;

        // calculation statements
        interest = (deposit * interestRate * years) / 100;
        newBalance = deposit + interest;

        // print out final statements
        System.out.println("Your original deposited amount is: $" + deposit);
        System.out.println("Your amount paid on deposit is: $" + interest);
        System.out.println("Your New Balance with Interest is: $" + newBalance);

    }
}