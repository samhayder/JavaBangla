package com.problem_solving;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_example {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Please type array size: ");
        int size = scan.nextInt();

        // 01. Take 10 integer inputs from user and store them in an array and print them on screen.

        int[] arr = new int[size];

        //Input of array from user
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Enter integer Number: [%d] ",i);
            arr[i] = scan.nextInt();
        }

        //Print array
        for(int i = 0; i < arr.length; i++){
            System.out.println("The value of arr["+i+"] is: " + arr[i]);
        }

        // 02. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.

        System.out.println("Please give a number again to search an array. ");
        int arrSearch = scan.nextInt();
        boolean searchResult = false;

        for(int search : arr){
            if(search == arrSearch){
                searchResult = true;
                break;
            }
        }

        System.out.println("Is " + arrSearch + " present in the array: " + searchResult);

        /*
        Output ==>>
        Array: [5, 1, 1, 9, 7, 2, 6, 10, 3, 4]
        Is 7 present in the array: true
        */

        // 03. Take 20 integer inputs from user and print the following:
        //count of positive numbers
        //count of negative numbers
        //count of 0s.
        //count of even numbers
        //count of odd numbers

        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                positiveCount++;
            }else if(arr[i] < 0) {
                negativeCount++;
            }else {
                zeroCount++;
            }
            if(arr[i] % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Number of positive number: " + positiveCount);
        System.out.println("Number of negative number: " + negativeCount);
        System.out.println("Number of Zero number: " + zeroCount);
        System.out.println("Number of even number: " + evenCount);
        System.out.println("Number of odd number: " + oddCount);


        // 04. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an array but in reverse order.
        int[] arrTwo = new int[size];
        int j = 0;

        for(int i = arrTwo.length-1; i >= 0; i--){
            arrTwo[i] = arr[j];
            j++;
        }

        //Print reserve an array
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.println("The value of arrTwo["+i+"] is: " +arrTwo[i]);
        }

        // 05. Write a program to find the sum and product of all elements of an array.

        int[] productPrice = {10,20,30,40,50};
        int arrOfSum = 0;

        for(int i = 0; i < productPrice.length; i++){
            arrOfSum = arrOfSum + productPrice[i];
        }
        System.out.println("All product total sum is: " + arrOfSum);

        // 06. Initialize and print all elements of a 2D array.
        int[][] tree = new int[2][3];

        for (int row = 0; row < tree.length; row++) {
            for (int col = 0; col < tree[row].length; col++) {
                System.out.printf("Type your code [%d][%d] ", row,col);
                tree[row][col] = scan.nextInt();
            }
            System.out.println();
        }
        
        //Print an array
        for (int row = 0; row < tree.length; row++) {
            for (int col = 0; col < tree[row].length; col++) {
                System.out.print(tree[row][col] + " ");
            }
            System.out.println();
        }

        //Print 2D array another way
        int[][] treeAnotherWay = {{1,2,3},{4,5,6}};

        for (int row = 0; row < treeAnotherWay.length; row++) {
            for (int col = 0; col < treeAnotherWay[row].length; col++) {
                System.out.print(treeAnotherWay[row][col] + " ");
            }
            System.out.println();
        }

        // 07. Find largest and smallest elements of an array.
        int[] largestAndSmall = {5,7,9,13,15,16};
        int smallest = largestAndSmall[0];
        int largest = largestAndSmall[0];

        for (int i = 0; i < largestAndSmall.length; i++) {
            if(largestAndSmall[i] > largest){
                largest = largestAndSmall[i];
            }else if(largestAndSmall[i] < smallest){
                smallest = largestAndSmall[i];
            }
        }
        System.out.println("Array small number: " + smallest);
        System.out.println("Array largest number: " + largest);

        // 08.Write a program to check if elements of an array are same or not it read from front or back. E.g.-
        int[] arrFirst = {1,2,3,4,5,6};
        int copyFirstArr = arrFirst.length - 1;
        boolean read = false;

        for (int i = 0; i < arrFirst.length / 2; i++) {
            if(arrFirst[i] == arrFirst[copyFirstArr]){
                read = true;
                break;
            }
            copyFirstArr--;
        }
        System.out.println(read);













    }
}
