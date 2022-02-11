package com.company;

import java.util.Scanner;

public class Pattern7 {


     /*          8 8 8 8 8 8 8 8
                  7 7 7 7 7 7 7
                   6 6 6 6 6 6
                    5 5 5 5 5
                     4 4 4 4
                      3 3 3
                        2 2
                         1 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) { // row
                    //  4>= 1
           for(int j = 1; j <= rows - i + 1; j++ ){
                         //1 <=
               System.out.print(" ");
           }
            for(int k = 1; k <= i; k++ ){
                // 1 <= 5
               System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
