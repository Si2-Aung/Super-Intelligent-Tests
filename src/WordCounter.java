import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) throws IOException {

        //Create input stream & scanner
        FileInputStream fin = new FileInputStream("readwords.txt");
        Scanner fileInput = new Scanner(fin);

        //Create the ArrayLists
        ArrayList<String> word = new ArrayList<String>();
//        ArrayList<Integer> count = new ArrayList<Integer>();

        while (fileInput.hasNext()){
            String nextWord = fileInput.next();
            word.add(nextWord);
        }
        fileInput.close();
        fin.close();

        int totalLetters = 0;
        for(int i = 0; i < word.size(); i++){
            String tmp = word.get(i);
            totalLetters += tmp.toCharArray().length;
        }

        System.out.println("Your Text has " + word.size() + " Words and " + totalLetters +" letters." );


    }
}
