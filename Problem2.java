import java.util.Scanner;

class problem2 {

    public static void main(String[] args) {

        int quarters;   //
        int dimes;      //
        int nickels;    //

        Scanner input = new Scanner(System.in);
        int cents;

        System.out.print("Enter the number of quarters:  ");
        quarters = input.nextInt();
        input.nextLine();

        System.out.print("Enter the number of dimes:     ");
        dimes = input.nextInt();
        input.nextLine();

        System.out.print("Enter the number of nickels:   ");
        nickels = input.nextInt();
        input.nextLine();

        cents = quarters + dimes + nickels;

        System.out.println();
        System.out.println("Coins are worth " + cents + " cents");
        System.out.println();

    }
}
