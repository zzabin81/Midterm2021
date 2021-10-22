package problems;//done

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        //implementation here...

        Set<String> duplicates = duplicateWords(string);
        System.out.println("In this scenario duplicate words are " + duplicates);

    }
    public static Set<String> duplicateWords(String s) {

        DecimalFormat df = new DecimalFormat(".00");

        if (s == null || s.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicateWords = new HashSet<>();
        String[] array = s.split(" ");
        double avgLength = (double) s.length() / array.length;

        Set<String> set = new HashSet<>();
        ArrayList<String> arraylist = new ArrayList<String>();
        for (String word : array) {
            arraylist.add(word);
            if (!set.add(word)) {
                duplicateWords.add(word);
            }
        }
        for (String word : duplicateWords) {
            if (Collections.frequency(arraylist, word) > 1) {
                System.out.println("'" + word +"' occurs " + Collections.frequency(arraylist, word) + " times.");
            }
        }
        System.out.println("Average length of these words is: " + df.format(avgLength));
        return duplicateWords;
    }

}