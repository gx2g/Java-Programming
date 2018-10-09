// ********************************************************************

/*     Program Author:    Robert Resendez                           */
/*         Class Name:    CO-SCI 290 Java Programming               */
/*      Course Lesson:    Week6 Project 2                           */
/*        Discription:    This program is Paper, Rock, Scissors     */
/*                        against the computer.                     */

// ********************************************************************

import java.util.Random;
import java.util.Scanner;

public class RockPaperSissors {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // while true run these invoke function calls
        while(true) {
            // user selection method
            char user = selection();
            // computer selection method
            char computer = CP();

            // calculate winner method
            winner(user,computer);
            // repeat game method
            char ch = Repeat();

            // if Y continue else break
            if(ch=='y' || ch=='Y') {
                continue;
            }
            else {
                break;
            }
        }
    }

    // repeat method
    private static char Repeat() {

        // Getting the character from the user 'Y' or 'y' or 'N' or 'n'
        System.out.print("Do you want to Play again (Y/N) ?");
        char ch = sc.next(".").charAt(0);
        return ch;
    }

    // winner calculation method
    private static void winner(char user, char computer) {

        String winner = " ";

        /* Based on user and computer selected numbers
         * the corresponding block will get executed
         */

        if (user == 'r' && computer == 's') {
            winner = "Rock versus Scissors..You win!";
        }

        else if (user == 's' && computer == 'r') {
            winner = "Scissors versus Rock..You Lose!";
        }

        else if (user == 'r' && computer == 'p') {
            winner = "Rock versus Paper..You Lose!";
        }

        else if (user == 'p' && computer == 'r') {
            winner = "Paper versus Rock..You Win!";
        }

        else if (user == 'p' && computer == 's') {
            winner = "Paper versus Scissors..You lose!";
        }

        else if (user == 's' && computer == 'p') {
            winner = "Scissors versus Paper..You Win!";
        }

        else {
            if (user == 'r' && computer == 'r') {
                winner = "Rock versus Rock...Tie!";
            }
            else if (user == 'p' && computer == 'p') {
                winner = "Paper versus Paper...Tie!";
            }

            else if (user == 's' && computer == 's') {
                winner = "Scissors versus Scissors...Tie!";
            }
        }

        System.out.println(winner);
    }

    // computer random generation method
    private static char CP() {
        char comp = 0;

        // Creating an random class object
        Random r = new Random();
        int num = r.nextInt( (3 - 1) + 1) + 1;
        if( num == 1)
            comp = 'r';
        else if(num == 2)
            comp='p';
        else if(num == 3)
            comp='s';

        return comp;
    }

    private static char selection() {
        char user;

        while(true) {

            System.out.print("Enter Choice Rock 'r',Paper 'p', Scissors 's' :");

            user=sc.next(".").charAt(0);

            if( user != 'r' && user != 'p' && user != 's') {
                System.out.println("** Invalid Input **");
                continue;
            }
            else {
                break;
            }
        }

        return user;
    }
}