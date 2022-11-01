package com.hackerrank;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        //Question no: 04
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String name = scan.next();
            int rank = scan.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d %n", name,rank);
        }
        System.out.println("================================");


        /*Expected Output
        ================================

        java           100

        cpp            065

        python         050

        ================================
*/
    }
}
