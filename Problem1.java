import java.util.Scanner;


class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int firstInt = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int secondInt = input.nextInt();

        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %d%n", firstInt + secondInt / 2);
        System.out.printf("Remainder of two integers: %d%n", firstInt % secondInt);

    }
}