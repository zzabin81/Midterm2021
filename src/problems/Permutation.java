package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {


    public Permutation(String remaining, String s) {
    }

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation(" ", "ABC");
    }

    private static void permutation(String prefix, String str) {

        //implementation here...

        if (prefix.length() == 0) {
            System.out.print(str+" ");
            return;
        }
        for (int k = 0; k < prefix.length(); k++) {
            char toAppendToPermutation = prefix.charAt(k);
            String remaining = prefix.substring(0, k) + prefix.substring(k + 1);

            new Permutation(remaining, str + toAppendToPermutation);
        }

    }
}