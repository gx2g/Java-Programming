public class ShowRandomCharacter {
    public static void main(String[] args) {

        for (int i = 0; i < 175; i++) {
            char ch = (char) ((int)(Math.random() * ('z' - 'a' + 1)) + 'a');
            System.out.print(ch);

            if ((i+1) % 20==0)
                System.out.println();
        }

        System.exit(0);
    }
}