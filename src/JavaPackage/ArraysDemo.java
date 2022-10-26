package JavaPackage;

import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Enter Array size: ");
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
        System.out.println("Array Minimum: " + min);*/

        //For Each Loop
       /* String [] nameList = {"Samsuddin", "Hayder", "Yasin", "Salman", "Jannat"};
        for (String x : nameList){
            System.out.println(x);
        }

        int[] grade = {1,2,3,4,5};

        for (int x : grade) {
            System.out.println(x);

        }*/

        //********** 2D Array **************
        /*int[][] firstArray = new int[2][3];
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
        }*/

        //Matrix of Array Element
        /*int[][] elementArray = new int[3][3];
        int diagonalElements = 0;
        int upperTriangleElements = 0;
        int lowerTriangleElements = 0;

        //Input of array
        for (int row = 0; row < elementArray.length; row++) {
            for (int col = 0; col < elementArray.length; col++) {
                System.out.printf("Enter Element array: [%d][%d] ", row,col);
                elementArray[row][col] = sc.nextInt();
            }
        }

        //Output an array
        for (int row = 0; row < elementArray.length; row++) {
            for (int col = 0; col < elementArray.length; col++) {
                System.out.print(elementArray[row][col] + " ");

                //Diagonal Elements
                if (row == col) {
                    diagonalElements = elementArray[row][col] + diagonalElements;
                }

                //Upper Triangle Elements
                if(row < col){
                    upperTriangleElements = elementArray[row][col] + upperTriangleElements;
                }

                //Lower Triangle Elements
                if (row > col) {
                    lowerTriangleElements = elementArray[row][col] + lowerTriangleElements;
                }

            }
            System.out.println();

        }

        System.out.println("Diagonal Elements an array: " + diagonalElements);
        System.out.println("Upper Triangle Elements an array: " + upperTriangleElements);
        System.out.println("Lower Triangle Elements an array: " + lowerTriangleElements);*/

        // Array Output
        /*int[][] arrayTriangle = new int[4][];
        int arrayPlus = 0;
        //set Array Triangle
        arrayTriangle[0] = new int[1];
        arrayTriangle[1] = new int[2];
        arrayTriangle[2] = new int[3];
        arrayTriangle[3] = new int[4];
        //Asseing Value
        for (int row = 0; row < arrayTriangle.length; row++) {
            for (int col = 0; col < row + 1; col++) {
                arrayTriangle[row][col] = arrayPlus;
                arrayPlus++;
            }
        }
        //Output array
        for (int row = 0; row < arrayTriangle.length; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(arrayTriangle[row][col] + " ");
            }
            System.out.println();
        }*/

        //Sorting an Array
        /*int[] arrSort = {2,3,4,5,7,1};

        Arrays.sort(arrSort);

        //Sorting Ascending
        for (int i = 0; i < 6; i++) {
            System.out.print(arrSort[i] + " ");
        }
        System.out.println();
        //Sorting Descending
        for (int i = 5; i >= 0; i--) {
            System.out.print(arrSort[i] + " ");
        }*/

        // ******** ArrayList ***************
        ArrayList <Integer> numArrList = new ArrayList<Integer>();

        System.out.println(numArrList.size());

        //Adding Elements
        numArrList.add(1);
        numArrList.add(2);
        numArrList.add(3);
        numArrList.add(3,4);

        //Print ArrayList
        System.out.println("Basic Print ArrayList: " +numArrList);

        System.out.println();

        //For each
        System.out.print("For-each Print ArrayList: ");
        for (int x : numArrList){
            System.out.print(x + " ");
        }

        System.out.println();

        //Iterator
        Iterator itt = numArrList.iterator();
        System.out.print("Iterator Print ArrayList: ");
        while (itt.hasNext()){
            System.out.print(itt.next() + " ");
        }

        System.out.println();

        boolean empty = numArrList.isEmpty();
        System.out.println("ArrayList check is empty: " + empty);

        //ArrayList Sort
        Collections.sort(numArrList);
        System.out.println("ArrayList sorting: " + numArrList);

        //ArrayList Reverse
        Collections.sort(numArrList, Collections.reverseOrder());
        System.out.println("ArrayList Reverse: " + numArrList);





    }
}
