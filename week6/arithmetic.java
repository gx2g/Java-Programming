import java.util.*;
import java.io.*;


public class arithmetic {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int choice;
        do {
            int a = (int)(Math.random() * (99-10+1))+10;
            int b = (int)(Math.random() * (99-10+1))+10;

            choice = displayMenu();

            if (choice == 1) {
                addition(a, b); // x=a, y=b
            }else if(choice == 2){
                subtraction(a, b);
            }else if(choice == 3){
                multiply(a, b);
            }else if(choice == 4){
                division(a, b);
            }

        }while(choice != 5);

        System.out.println(" ======>>> " + choice);
        System.exit(0);
    }


    public static int displayMenu()
    {
        System.out.println("***********************************");
        System.out.println("******* 1. Addition ***************");
        System.out.println("******* 2. Subtraction ************");
        System.out.println("******* 3. Multiplication *********");
        System.out.println("******* 4. Division ***************");
        System.out.println("******* 5. Quit *******************");
        System.out.println("***********************************");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

        return choice;
    }

    public static void addition(int x, int y) {
        System.out.println("What is");
        System.out.println(" " + x);
        System.out.println("+" + y);

        int answer = input.nextInt();
        if(answer == ( x + y )) {
            System.out.println("Good Job Kid!");
        }
        else {
            System.out.println("Sorry Kid, correct answer was: " + ( x + y ) );
        }


    }

    public static void subtraction(int x, int y) {

        if(y > x) {
            System.out.println("What is");
            System.out.println(" " + y);
            System.out.println("-" + x);
            int answer = input.nextInt();

            if(answer == ( y - x )) {
                System.out.println("Good Job Kid!");
            }
            else {
                System.out.println("Sorry Kid, correct answer was: " + ( y - x ) );
            }
        }
        else{
            System.out.println("What is");
            System.out.println(" " + x);
            System.out.println("-" + y);
            int answer = input.nextInt();

            if(answer == (x - y)) {
                System.out.println("Good Job Kid");
            }
            else {
                System.out.println("Sorry Kid, correct answer was: " + (x - y));
            }
        }

    }

    public static void multiply(int x, int y) {

        if(y > x) {
            System.out.println("What is");
            System.out.println(" " + y);
            System.out.println("x" + x);
            int answer = input.nextInt();

            if(answer == ( y * x )) {
                System.out.println("Good Job Kid!");
            }
            else {
                System.out.println("Sorry Kid, correct answer was: " + ( y * x ) );
            }
        }
        else{
            System.out.println("What is");
            System.out.println(" " + x);
            System.out.println("x" + y);
            int answer = input.nextInt();

            if(answer == (x * y)) {
                System.out.println("Good Job Kid");
            }
            else {
                System.out.println("Sorry Kid, correct answer was: " + (x * y));
            }
        }

    }

    public static void division(int x, int y) {

        if(y > x) {
            System.out.println("What is");
            System.out.println(" " + y);
            System.out.println("/" + x);
            int answer = input.nextInt();

            if(answer == ( y / x )) {
                System.out.println("Good Job Kid!");
            }
            else {
                System.out.println("Sorry Kid, correct answer was: " + ( y / x ) );
            }
        }
        else{
            System.out.println("What is");
            System.out.println(" " + x);
            System.out.println("/" + y);
            int answer = input.nextInt();

            if(answer == (x / y)) {
                System.out.println("Good Job Kid");
            }
            else {
                System.out.println("Sorry Kid, correct answer was: " + (x / y));
            }
        }

    }

}