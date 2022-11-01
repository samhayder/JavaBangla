package com.java_basic;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        ***** Control Statement *****
         01.Selection
            01.1. if
            01.2. else
            01.3. switch
         02.Iteration/Looping
            02.1. for
            02.2. while
            02.3. do while
         03.Jump
            03.1. break
            03.2. continue
            03.3. return
          */

        //Check Odd or Even number
        /*System.out.print("Enter positive integer number: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + ": Even Number.");
        } else {
            System.out.println(num + ": Odd Number.");
        }*/

        //Check Vowel or Consonant
        /*System.out.print("Type single letter of character: ");
        char userSearch = sc.next().charAt(0);
        String str = "aeiouAEIOU";

        if (str.indexOf(userSearch) != -1) {
            System.out.println(userSearch+ " is a Vowel");
        }else {
            System.out.println(userSearch+ " is a Consonant");
        }*/

        //Check Capital or Small =>01
        /*System.out.print("Type letter: ");
        String userSearch = sc.nextLine();

        if(userSearch.toUpperCase() == userSearch){
            System.out.println("Capital Letter");
        } else {
            System.out.println("Small Letter");
        }*/
        //Check Capital or Small =>02
        /*char userSearch = sc.next().charAt(0);
        if (userSearch >= 'A' && userSearch <= 'Z'){
            System.out.println("Capital Letter");
        } else if (userSearch >= 'a' && userSearch <= 'z') {
            System.out.println("Small Letter");
        } else {
            System.out.println("Not a Letter");
        }*/

        //Check Maximum or Minimum Number
        /*System.out.print("Type First inter number: ");
        int userIntFirst = sc.nextInt();
        System.out.print("Type Second inter number: ");
        int userIntSecond = sc.nextInt();

        if (userIntFirst > userIntSecond) {
            System.out.println(userIntFirst+ " Maximum is a first Input");
            System.out.println(userIntSecond+ " Minimum is a Second Input");
        } else {
            System.out.println(userIntSecond+" Maximum is a Second Input");
            System.out.println(userIntFirst+" Minimum is a first Input");
        }*/

        //Check Leap Year
        /*System.out.print("Type a full Year number(4 digit): ");
        int userYear = sc.nextInt();

        if ((userYear % 400 == 0) || (userYear % 4 == 0) || (userYear % 100 == 0)){
            System.out.println(userYear+ " Leap Year");
        }else {
            System.out.println(userYear+ " Not Leap Year");
        }*/

        // ***** Bitwise ******************************
        // & => Bitwise and (*)
        // | => Bitwise or (+)
        // ^ => Bitwise EXOR (-1 count)
        // >> => Bitwise Shift Right
        // << => Bitwise Shift left
        // ! => Bitwise NOT

        /*int a = 420;
        int b = 12;
        int c;

        c = a & b;
        System.out.println("Bitwise And is: " + c);

        c = a | b;
        System.out.println("Bitwise Or is: " + c);

        c = a ^ b;
        System.out.println("Bitwise Exor is: " + c);*/

        //01. Print sum of all the numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++){
             sum = sum + i;
        }
        System.out.println("Sum of all the numbers from 1 to 10 is: " + sum);

        //02. Print Minas of all the numbers from 1 to 10
        int subtract = 0;
        for (int i = 1; i <= 15; i++){
            subtract = subtract - i;
        }
        System.out.println("Subtract of all the numbers from 1 to 10 is: " + subtract);

        //3. Print sum of all the even numbers from m to n
        int sumEven = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                sumEven = sumEven + i;
            }
        }
        System.out.println("Sum of all the Even numbers from 1 to 10 is: " + sumEven);

        //04. Print sum off all the odd numbers from m to n
        int sumOdd = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 != 0){
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("Sum of all the Odd numbers from 1 to 10 is: " + sumOdd);

        //*********** Series *****************************
        //01. 1+2+3+...+n
        int n = 10;
        double nFloat = 10;
        double sumResultFloat = 0;
        int sumResult = 0;
        int multiplyResult = 1;

        for (int i = 1; i <= n; i = i+1){
            sumResult = sumResult + i;
        }
        System.out.println("Series 01=> sum off n numbers: "+sumResult);

        //02. 1+3+5...+n
        for (int i = 1; i <= n; i = i+2){
            sumResult = sumResult + i;
        }
        System.out.println("Series 02=> sum off n numbers: "+sumResult);

        //03. 1.5+2.5+3.5...+n.5
        for (double i = 1.5; i <= nFloat; i = i+1){
            sumResultFloat = sumResultFloat + i;
        }
        System.out.println("Series 03> sum  off n numbers: "+sumResultFloat);

        //04. 2x4x6...xn
        for (int i = 2; i <= n; i = i+2){
            multiplyResult = multiplyResult * i;
        }
        System.out.println("Series 04=> Multiply off n numbers: "+multiplyResult);

        //05. 1^2x2^2x3^2...xn^2
        for (int i = 1; i <= n; i = i+1){
            multiplyResult = multiplyResult * i*i;
        }
        System.out.println("Series 05=> Multiply off n numbers: "+multiplyResult);

        //************ Factorial Number **************************
        int factNum = 12;
        int factResult = 1;

        for (int i = factNum; i >= 1; i--){
            factResult = factResult * i;
        }
        System.out.println(factNum+"! Factorial Number is: "+ factResult);

        //************ Multiplication Table **************************
        int startNum = 1;
        int endNum = 3;

        for (int i = startNum; i <= endNum; i++){
            //Inner Loop for Time Table
            for (int j = 1; j <= 10; j++){
                System.out.println(i + "x" + j + " = " +i*j);
            }
            System.out.println();
        }

        //************ Prime Number **************************
        int primeNum = 13;
        int count = 0;

        for (int i = 2; i < primeNum; i++){
            if (primeNum % i == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println(primeNum + " is a Prime Number.");
        }else {
            System.out.println(primeNum + "is not a Prime Number.");
        }

        //02 Prime number m to n
        int startPrimeNum = 2;
        int endPrimeNum = 100;

        for (int i = startPrimeNum; i <= endPrimeNum; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(startPrimeNum + " to " + endPrimeNum + " is all prime number: " + i);
            }
            count = 0;
        }

        //************ Fibonacci Series **************************
        //0 1 1 2 3 5 8 13 21 ...
        int fiboNum = 10;
        int firstFibo = 0;
        int secondFibo = 1;
        int fibonacci;

        System.out.print(firstFibo + " " + secondFibo);

        for (int i = 3; i <= fiboNum; i++){
            fibonacci = firstFibo + secondFibo;
            firstFibo = secondFibo;
            secondFibo = fibonacci;
            System.out.print(" "+fibonacci);
        }
        System.out.println();

        //************ Sum of Digit **************************
        //123 => 6
        int numInput = 153;
        int temp = numInput;
        int sumOfDigit = 0;
        int rem;

        /*
        while (temp != 0){
            rem = temp % 10;
            sumOfDigit = sumOfDigit + rem;
            temp = temp / 10;
        }
        System.out.println(numInput+ " Sum of Digit: " + sumOfDigit);
        */

        //Reverse Number 123 => 321
        /*
        while (temp != 0){
            rem = temp % 10;
            sumOfDigit = sumOfDigit * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(numInput + " Reverse Number: " + sumOfDigit);
        */

        //Palindrome Number 121 => 121
        /*
        while (temp != 0){
            rem = temp % 10;
            sumOfDigit = sumOfDigit * 10 + rem;
            temp = temp / 10;
        }
        if (numInput == sumOfDigit){
            System.out.println(numInput + " Palindrome Number.");
        } else {
            System.out.println(numInput + " Not a Palindrome Number.");
        }
        */

        //Armstrong Number 153 => 1^3 + 5^3 + 5^3 = 153
        while (temp != 0){
            rem = temp % 10;
            sumOfDigit = sumOfDigit + rem * rem * rem;
            temp = temp / 10;
        }
        if (numInput == sumOfDigit){
            System.out.println(numInput + " Armstrong Number.");
        } else {
            System.out.println(numInput + " Not a Armstrong Number.");
        }




        



    }
}
