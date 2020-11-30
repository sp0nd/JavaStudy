package com.tuyano.CollectionGenerics;

import java.util.Vector;


public class VectorInteger {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);

        //vector insert
        v.add(2,100);

        System.out.println("Vector Element " + v.size());
        System.out.println("Vector capacity " + v.capacity());

        //All integer output of vectors
        for(int i=0;i<v.size();i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        //Add all integers of vectors
        int sum=0;
        for(int i=0;i<v.size();i++){
            int n = v.elementAt(i);
            sum+=n;
        }
        System.out.println("Add all integers of vectors: " + sum);

    }
}