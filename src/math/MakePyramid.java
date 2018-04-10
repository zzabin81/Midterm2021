package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

            for (int i=0; i<6; i++){
                for (int j =5; j>=i; j--){
                    System.out.print(" ");
                }
                for (int k=0; k<=i; k++){
                    System.out.print("* ");
                }
                    System.out.println();
                }

         }
  }
