package JavaPackage;

import java.time.Year;
import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        char userSearch = sc.next().charAt(0);
        if (userSearch >= 'A' && userSearch <= 'Z'){
            System.out.println("Capital Letter");
        } else if (userSearch >= 'a' && userSearch <= 'z') {
            System.out.println("Small Letter");
        } else {
            System.out.println("Not a Letter");
        }

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


    }
}
