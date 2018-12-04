import java.util.Scanner;

public class quizOnArray{


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("how many: ");
        int num = input.nextInt();

        double[] ar = new double[num];
        fillArray(ar);
        double arAve = getAverage(ar);

        System.out.println("arAverage is: " + arAve + " count: " + getCount(ar, arAve) + "\n");


        double[] a = new double[5];
        fillArray(a);
        double ave = getAverage(a);

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > ave){
                count++;
            }
        }
        System.out.println("no method, Total is: " + count + "\n");
        System.out.println("method, Total is: " + getCount(a, ave) + "\n");

    }


    public static int getCount(double [] x, double ave){
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > ave){
                count++;
            }
        }
        return count;
    }



    // void doesn't return anything
    public static void fillArray(double [] x) {
        Scanner input = new Scanner(System.in);

        for(int i=0 ; i < x.length; i++) {
            System.out.print("Enter number: ");
            x[i] = input.nextDouble();
        }

    }

    // returns a double
    public static double getAverage(double [] x) {

        double sum = 0.0;


        for(int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }

        return sum / x.length;

    }



}