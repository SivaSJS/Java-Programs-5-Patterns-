package com.company;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i <= rows - 1; i++) { // rows

            for (int j = 0; j <= i; j++) {// columns and space

                System.out.print(" ");
            }

            for (int k = 0; k <= rows - 1 - i; k++) {

                System.out.print("*" + " "); // content to print
            }

            System.out.println();

        }


    }
}
