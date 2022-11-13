package com.corejava_durgasir.fundamental;

public class list4_literals {
    public static void main(String[] args) {

        //**** Integral Literals *****

        // 1. decimal-form :(base 10); range: 0 to 9;
        int deci = 10;

        // 2. octal-form: (base 8); range: 0 to 7;
        int octa =  010; //prefix 0

        // 3. hexa-decimal-form: (base 16); range: 0 to 9, a to f;
        int hex = 0x10; //prefix 0x

        // Java JVM convert decimal number
        System.out.println(deci+ "..." + octa + "..." + hex);

        // Convert rules: octal to decimal
        int x = 027;
        // (27)8 = (?)10
        // 7*8^0 + 2*8^1
        // 7*1 + 2*8
        // 7 + 16
        // 23 ans
        System.out.println(x);

        // Convert rules: octal to decimal
        int y = 0x27;
        // (27)16 = (?)10
        // 7*16^0 + 2*16^1
        // 7*1 + 2*16
        // 7 + 32
        // 39 ans
        System.out.println(y);

        char ch = 97;
        System.out.println(ch);

        int bin = 0B1111;
        System.out.println(bin);

        float ab = 10L;
        System.out.println(ab);


    }
}
