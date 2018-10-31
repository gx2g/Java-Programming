import java.util.Scanner;

public class Message {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String letter = "abcdefghijklmnopqrstuvwxyz";
        String encode = "zyxwvutsrqponmlkjihgfedcba";
        String mess = input.nextLine();

        String x = "hello";
        String out = " ";

        for (int i = 0; i < x.length(); i++) {
            char ch= x.charAt(i);
            int location = letter.indexOf(ch);
            System.out.println("=====>>> " + location);
            out += encode.charAt(location);
        }

        System.out.println(out);


    }
}