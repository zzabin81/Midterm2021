package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        checkAnagram("CAT", "ACT");
        checkAnagram("MARY", "ARMY");
    }
    public static void checkAnagram(String word, String anagram){

        //implementation here...


    }
    private static boolean isAnagram(String word, String anagram){

        //implementation here...


        return anagram.isEmpty();
    }
}
