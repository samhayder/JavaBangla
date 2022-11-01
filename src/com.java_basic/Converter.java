package com.java_basic;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Temperature Converter => Celsius to Fahrenheit
       /* System.out.print("Enter Celsius value: ");
        double celsius = sc.nextDouble();
        double fahrenheit;

        fahrenheit = (celsius * 1.8) +32; // (f*9/5) + 32
        System.out.println(celsius + " Celsius to " + fahrenheit + " Fahrenheit");*/

        //Fahrenheit to Celsius
        System.out.print("Enter Fahrenheit value: ");
        double fahrenheit = sc.nextDouble();
        double celsius;

        celsius = (fahrenheit -32) * 5/9; // (c-32) * 5/9
        System.out.println(fahrenheit + " Fahrenheit to " + celsius + " Celsius");



    }
}
