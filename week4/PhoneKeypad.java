//****************************************************************

/*     Program Author:    Robert Resendez                       */
/*         Class Name:    CO-SCI 290 Java Programming           */
/*      Course Lesson:    Week4 Project 1 Phone.doc             */
/*        Discription:    Program that takes in input from      */
/*                        user to simulate a old style phone    */
/*                        turns letters into numbers like a     */
/*                        keypad                                */

//****************************************************************

import java.util.Scanner;

// class name PhoneKeypad
public class PhoneKeypad {
    // create static method with char uppercaseLetter
    public static int getNumber(char uppercaseLetter) {
        // create variable number and declare number to 0;
        int number = 0;

        switch (uppercaseLetter) {
            case 'A': case 'B': case 'C': number = 2;
                break;
            case 'D': case 'E': case 'F': number = 3;
                break;
            case 'G': case 'H': case 'I': number = 4;
                break;
            case 'J': case 'K': case 'L': number = 5;
                break;
            case 'M': case 'N': case 'O': number = 6;
                break;
            case 'P': case 'Q': case 'R': case 'S': number = 7;
                break;
            case 'T': case 'U': case 'V': number = 8;
                break;
            case 'W': case 'X': case 'Y': case 'Z': number = 9;
                break;
        }
        return number;
    }

    public static void main(String[] args) {

        // Promt user response for data input
        System.out.print("(Please Enter the Letters in Capital): ");

        // create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // string phone breaks up the characters of the input
        String phone = keyboard.nextLine();

        // close scanner keyboard
        keyboard.close();

        // create variable phoneLength with expression
        // length() method returning the number of characters in the string
        int phoneLength = phone.length();

        // for loop through phoneLenth and increment 1
        for (int i=0; i < phoneLength; i++) {

            // create variable currChar with charAt() method that returns the character of the specifed index
            char currChar = phone.charAt(i);

            // if character.isLetter(currChar) method specifies if character is a letter
            if (Character.isLetter(currChar)) {
                // assigning currChar to uppercase for output
                currChar = Character.toUpperCase(currChar);

                // local variable number with getNumber() method, grab currChar assign to number
                int number = getNumber(currChar);

                // print out number to screeen
                System.out.print(number);
            }

            else {
                // else print currChar
                System.out.print(currChar);
            }

        }
        // create a line break
        System.out.println();
    }
} 