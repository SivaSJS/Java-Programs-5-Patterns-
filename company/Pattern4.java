package com.company;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows:  ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {

            for (int k = rows - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i; k > 1; k--) {
                System.out.print(k - 1);
            }
            System.out.println();
        }


    }
}
