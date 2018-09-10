import java.util.Scanner; /* Scanner is in the java.util package */

class Problem3 {

    public static void main(String[] args) {

        /* Variable Decloration */
        int acceleration = 32;

        /* Create a Scanner Object */
        Scanner input = new Scanner(System.in);

        /* Prompt the user to enter a radius */
        System.out.println("Enter time in Seconds: ");
        int time = input.nextInt();

        int distance = acceleration * (time * time) / 2;

        System.out.println("If an Object was falling for " + time
                + " seconds. The Object would fall " + distance + " feet. ");



    }
}