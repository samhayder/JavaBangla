package Hackerrank;

public class DataTypes {
    public static void main(String[] args) {
        //Question no: 7

       /* -150
        150000
        1500000000
        213333333333333333333333333333333333
        -100000000000000*/

        int s = 1;

        try
        {
            long x = -150;
            System.out.println(x + " can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte");

            if(x>= -32768 && x<= 32767)System.out.println("* short");

            if(x>= -Math.pow(2,31) && x<= Math.pow(2,31)-1)System.out.println("* int");                       if(x>= -Math.pow(2,63) && x<= Math.pow(2,63)-1)System.out.println("* long");
        }

        catch(Exception e)
        {
            System.out.println(s +" can't be fitted anywhere.");
        }





    }
}
