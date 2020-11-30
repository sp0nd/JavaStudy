package com.tuyano.CollectionGenerics;

import java.util.*;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        //Entering and Inserting ArrayList
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<4;i++){
            System.out.println("Enter a name here >> ");
            String s = scan.next();
            a.add(s);
        }

        //output of all elements in ArrayList
        for(int i=0;i<a.size();i++){
            String name = a.get(i);
            System.out.println(name + " ");
        }

        //Output longest string element
        int LongestElement=0;
        for(int i=0;i<a.size();i++){
            //String Length Comparison
            if(a.get(LongestElement).length()<a.get(i).length())
                LongestElement=i;
        }
        System.out.println("\nLongestElement : "+ a.get(LongestElement));
        scan.close();
    }

}
