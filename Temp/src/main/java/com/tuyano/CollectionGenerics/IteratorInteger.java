package com.tuyano.CollectionGenerics;
import java.util.*;
public class IteratorInteger {
    public static void main(String[] args) {
        Vector<Integer> v =new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        //Output all integers using Iterator
        Iterator<Integer> it = v.iterator(); //Get iterator object
        while(it.hasNext()){
            int n= it.next();
            System.out.println(n);
        }

        //Add all integers using iterator
        int sum=0;
        it = v.iterator(); //Reset it

        while(it.hasNext()){
            int n= it.next();
            sum += n;
        }
        System.out.println("Sum of all integers in vectors :" + sum);
    }
}
