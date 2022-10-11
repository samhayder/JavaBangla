package JavaPackage;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 3;
        int col;

        for (int i = 1; i <= row; i++){
            //Inner Loop for col
            for (int j = 1; j <= i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }










    }
}
