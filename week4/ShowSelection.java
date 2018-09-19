import java.util.*;

public class ShowSelection

{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        oneWayIf();
        multiWayIf();

    }



    public static void oneWayIf() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer:");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println(num + " is Negitive");
            System.exit(0);
        }
            System.out.println(num + " testing");

    }

    public static void multiWayIf(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer:");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println(num + " is Negitive");
            System.exit(0);
        }
        else if (num > 0) {
            System.out.println(num + " is Postive");
            System.exit(0);
        }

        else if (num == 0) {
            System.out.println(num + " is Zero");
            System.exit(0);
        }

    }

}