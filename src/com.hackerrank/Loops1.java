package com.hackerrank;

public class Loops1 {
    public static void main(String[] args) {
        //Question no: 05

        //int n = 2;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            System.out.println();
        }
    }
}
