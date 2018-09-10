import java.util.Scanner;

class Problem2 {

    public static void main(String[] args) {

        int quarters;   //
        int dimes;      //
        int nickels;    //

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of quarters:  ");
        quarters = input.nextInt();
        input.nextLine();

        System.out.print("Enter the number of dimes:     ");
        dimes = input.nextInt();
        input.nextLine();

        System.out.print("Enter the number of nickels:   ");
        nickels = input.nextInt();
        input.nextLine();

        int totalQuarters = (quarters * 25);
        int totalDimes = (dimes * 10);
        int totalNickels = (nickels * 5);

        int totalCents = totalQuarters + totalDimes + totalNickels;

        System.out.println("Coins are worth " + totalCents + " cents");
        System.out.println();

    }
}
