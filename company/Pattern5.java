package com.company;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows:  ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int k = rows - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print((rows - j + 1));
            }
            for (int k = 1; k < i; k++) {
                System.out.print(rows - k);
            }
            System.out.println();
        }
    }
}
