package com.corejava_durgasir.fundamental;

public class list5_arrays {
    public static void main(String[] args){
        // Array declaration & creation
        int[] x = new int[3];

        // Array creation must be compulsory array size
        /*int[] arrSize = new int[]; //re: array dimension missing
        System.out.println(arrSize);*/

        // Array 0 size is legal
        int[] arrSizeOfZero = new int[0];
        System.out.println(arrSizeOfZero.length);

        // Array size ues data type value byte, short, char => int
        byte arrByte = 10;
        short arrShort = 15;
        char arrChar = 'a';

        int[] arrByteOfInt = new int[arrByte];
        int[] arrShortOfInt = new int[arrShort];
        int[] arrCharOfInt = new int['a'];
        System.out.println("Byte: "+ arrByteOfInt.length + " Short: " + arrShortOfInt.length + " Char: " + arrCharOfInt.length);

        //***** Two Dimensional Array *********
        int[][] arrTwo = new int [2][2];
        System.out.println(arrTwo);
        System.out.println(arrTwo[0]); //Array is null
        System.out.println(arrTwo[0][0]); //re: Cannot load from int array because

        //*** Example: 1
        int[][] xy = new int[1][2];
        xy[0][0] = 1;
        xy[1][0] = 2;
        xy[1][1] = 3;
        System.out.println(xy[0][0] + xy[1][0] + xy[1][1]);






    }
}
