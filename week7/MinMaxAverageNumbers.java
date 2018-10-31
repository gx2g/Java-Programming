import java.util.Scanner;

public class MinMaxAverageNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num, max=0, min=0, count=0, total=0;

        System.out.print("Enter numbers(end with 0): ");

        while (true) {
            num = in.nextInt();

            if(num == 0) break;

            if(count == 0) {
                min = num;
                max = num;
            }

            if(num < min) min = num;
            if(num > max) max = num;

            total += num;
            count++;

        }

        if(count == 0) {
            System.out.println("No numbers were entered");
        } else {
            System.out.println("average of numbers = " + ( total / (double)count ));
            System.out.println("largest = " + max);
            System.out.println("smallest = " + min);
        }
    }
}