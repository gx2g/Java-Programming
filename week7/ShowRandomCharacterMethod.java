public class ShowRandomCharacterMethod {

    public static void main(String[] args) {
        // print UpperCase Random
        for (int i = 0; i < 10; i++){
            System.out.println(ShowRandomCharacterMethod.getRandomCharacter('a' , 'z'));
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(Math.random() * (ch2 - ch1 + 1) + ch1);
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

}