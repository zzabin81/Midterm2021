package problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("inter word: ");
        String word = sc.nextLine();
        checkPalindrome(word);
    }
    public static void checkPalindrome(String string){
        String w = string.toLowerCase();
        String reverse = "";

        for(int i = w.length()-1; i >= 0; i--){
            reverse = reverse + w.charAt(i);
        }

        if (w.equals(reverse)){
            System.out.println(w+ " is a palindrome");
        }else{
            System.out.println(w+" is not a palindrome");
        }

    }
}
