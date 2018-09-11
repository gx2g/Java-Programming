import java.util.Scanner;

public class ShowInputOutput {
    public static void main(String[] args) {
        showIO();
        System.exit(0);
    }

    public static void showIO() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int num1 = input.nextInt();
        System.out.println("You just entered " + num1);

        System.out.print("Enter a double: ");
        double num2 = input.nextDouble();
        System.out.println("You just entered " + num2);

        System.out.print("Enter a true or false ");
        boolean num3 = input.nextBoolean();
        System.out.println("You just entered " + num3);

        input.nextLine();
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.println( name + " Your name is super cool");

    }
}