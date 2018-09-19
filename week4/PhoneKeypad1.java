/**
 * A program that prompts the user to enter a phone number as a string. The
 * input number may contain letters. The program translates a letter
 * (upper- or lowercase) to a digit and leaves all other characters intact.
 */

import java.util.Scanner;

public class PhoneKeypad1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character A-Z: ");

            char ch = input.next().charAt(0);

         if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is UppperCase");
         }
         else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is LowerCase");
            }

         else if (ch >= '0' && ch <= '9'){
             System.out.println(ch + " is a digit");
         }

        else {
            System.out.println(ch + " is not a Character or Digit");
            }
    }

}