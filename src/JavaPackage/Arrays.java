package JavaPackage;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter Array size: ");
        double sum = 0;
        double avg = 0;

        double[] numList = new double[5];
        double max = numList[0];
        double min = numList[0];

        //Array Input
        System.out.print("Enter Array number list: ");
        for (int i = 0; i < numList.length; i++) {
            numList[i] = sc.nextDouble();
        }
        //Array Output
        for (int i = 0; i < numList.length; i++) {
            //Total array Sum
            sum = sum + numList[i];
            //Average
            avg = sum / numList.length;
            //Maximum
            if (max < numList[i]) {
                max = numList[i];
            }
            //Minimum
            if (min > numList[i]){
                min = numList[i];
            }
        }
        System.out.println("Total Sum of array: " + sum);
        System.out.println("Array Average: " + avg);
        System.out.println("Array Maximum: " + max);
        System.out.println("Array Minimum: " + min);
*/
        //For Each Loop
        /*String [] nameList = {"Samsuddin", "Hayder", "Yasin", "Salman", "Jannat"};
        for (String x : nameList){
            System.out.println(x);
        }

        int[] grade = {1,2,3,4,5};

        for (int x : grade) {
            System.out.println(x);

        }*/

        //********** 2D Array **************
        int[][] firstArray = new int[2][3];
        int[][] secondArray = new int[2][3];
        int[][] sumOfArray = new int[2][3];

        //Input for First Array row =>
        for (int row = 0; row < 2; row++) {
            //Input for colum
            for (int col = 0; col < 3; col++) {
                System.out.printf("First Array [%d][%d]",row,col);
                firstArray[row][col] = sc.nextInt();
            }
        }

        //Input for Second Array row =>
        for (int row = 0; row < 2; row++) {
            //Input for colum
            for (int col = 0; col < 3; col++) {
                System.out.printf("Second Array [%d][%d]",row,col);
                secondArray[row][col] = sc.nextInt();
            }
        }

        //Output for First Array
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(firstArray[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Output for Second Array
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(secondArray[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Sum of Matrix Array
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sumOfArray[row][col] = firstArray[row][col] + secondArray[row][col];
                System.out.print(sumOfArray[row][col] + " ");
            }
            System.out.println();
        }




    }
}
