package math;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //implementation here...
        int i;
        int fact = 1;
        int num = 5;
        for (i=1; i<= num; i++) {
            fact = fact * i;
        }
      System.out.println("factorial of " + num + "is: " + fact);
    }

}
