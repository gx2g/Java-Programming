import java.util.*;
import java.io.*;

public class GuessingGame
{
    public static void main(String [] args)

    {
        Scanner input = new Scanner(System.in);

        int userGuess = 0;
        int computerGuess = 0;

        computerGuess = (int) (Math.random() * (100-1+1))+1;
        System.out.println("I am thinking 1-100");
        System.out.print("Guess it >>");
        userGuess = input.nextInt();

        while(computerGuess != userGuess)
        {
            if (userGuess > computerGuess)
            {
                System.out.println("Try lower...");
            }
            else
            {
                System.out.println("try higher...");
            }

            System.out.println("Guess it...");
            userGuess = input.nextInt();
        }

        System.out.println("You guessed it");

        System.exit(0);
    }

}