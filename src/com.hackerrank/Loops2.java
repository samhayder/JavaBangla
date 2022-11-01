package com.hackerrank;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        //Question no: 06

        Scanner scan = new Scanner(System.in);

        // (a+2^0.b),(a+2^0.b+2^1.b),...,(a+2^0.b+2^1.b+...+2^n-1.b)
        // a= 0; b = 2; s = 5;
        //s^0 => 0 + 1.2 = 2;
        //s^1 => 0 + 1.2 + 2.2 = 6;
        //s^2 => 0 + 1.2 + 2.2 + 4.2 = 14;
        //s^3 => 0 + 1.2 + 2.2 + 4.2 + 8.2 = 30;
        //s^4 => 0 + 1.2 + 2.2 + 4.2 + 16.2 + 16.2 = 62;

        int s = 1;

        for (int i = 0; i < s; i++){
            int a = 0;
            int b = 2;
            int n = 10;

            /*for (int j = 0; j < n; j++) {
                a = a + (int)Math.pow(2,j) * b;
                System.out.print(a + " ");
            }*/

            //Another way to solve
            for (int k = 0; k < n; k++){
                a = a + b;
                b = b*2;
                if(k > 0) {
                    System.out.print(" ");
                }
                System.out.print(a);
            }
            System.out.println();
        }







    }
}
