package OOP.O0PBasic;

import java.util.Scanner;

public class Recursion {

    //Using Recursion to calculate factorial number
    int factorial(int num) {
        if(num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }


    public static void main(String[] args) {
        Recursion ob = new Recursion();

        System.out.println(ob.factorial(4));
        System.out.println(ob.factorial(5));

        //Another way print factorial number....
        int factNumber = 6; //you can use input number
        int factorial = 1;

        if (factNumber <= 0) {
            System.out.println("Invalid Number.");
        } else {
            for (int i = factNumber; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println(factNumber + "! Factorial number is: " + factorial);
        }

        //GCD
        int num1 = 28;
        int num2 = 48;
        int rem, gcd;

        while(num2 != 0) {
            rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        gcd = num1;
        System.out.println(gcd);




    }






}
