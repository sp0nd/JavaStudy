package com.tuyano.WrapperEx;

public class WrapperClass {

    public static void main(String[] args) {
        System.out.println(Character.toLowerCase('A')); // A--> a

        char c1='4', c2='F';
        if(Character.isDigit(c1)) // character c1 == number true
            System.out.println(c1+"== Number");
        if(Character.isAlphabetic(c2)) //character c2 == english true
            System.out.println(c2+"== English");

        System.out.println(Integer.parseInt("-123"));//Convert "-123" to Decimal
        System.out.println(Integer.toHexString(28)); //Converting integer 28 to binary string
        System.out.println(Integer.toBinaryString(28)); //Convert 28 to hexadecimal
        System.out.println(Integer.bitCount(28)); //Number of Binary 1 for 28

        boolean b = (4>3); // b=true
        System.out.println(Boolean.toString(b)); //true to string "true"
        System.out.println(Boolean.parseBoolean("false")); // string to false
    }
}
