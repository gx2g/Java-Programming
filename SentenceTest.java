import java.util.Scanner;


public class SentenceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = scan.nextLine();
        System.out.println("The sentence to all capital letters: "+s.toUpperCase());
        System.out.println("The sentence to all lower letters: "+s.toLowerCase());
        String newString = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                newString = newString + Character.toLowerCase(ch);
            }
            else{
                newString = newString + Character.toUpperCase(ch);
            }
        }
        System.out.println("The each character if it is upper to lower and vice versa: "+newString);
    }

}