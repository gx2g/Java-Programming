import java.util.Scanner;
public class largestSmallest {
    public static void main(String str[])
    {
        System.out.println("Enter the number , to stop -99");
        int input;
        int small,large;
        Scanner scn=new Scanner(System.in);
        input=scn.nextInt();
        small=large=input;
        while(true)
        {
            input=scn.nextInt();
            if(input==-99)
                break;
            if(input>large )
                large=input;
            else if(input<small)
                small=input;
        }
        System.out.println("Smallest Number : "+small);
        System.out.println("Largest Number : "+large);
    }
}