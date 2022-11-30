import java.io.InputStream;
import java.util.Scanner;

public class WordCounterSystem {
    public static void main(String[] args) {
        System.out.println("Type you Text: ");
        Scanner scanner = new Scanner(System.in);
        String Text = scanner.nextLine();

        char[] letters = Text.toCharArray();
        int words = 0;
        int numberOfLetters = 0;

        for (int i = 0; i < letters.length; i++) {
            if ( letters[i] == ' ') {
                words++;
            }
            else numberOfLetters++;
        }
        System.out.println("");
        System.out.println("Your Text has " + words + " Words and " + numberOfLetters +" letters." );

    }
}
