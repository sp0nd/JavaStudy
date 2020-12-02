package com.tuyano.CollectionGenerics;

import java.text.CollationElementIterator;
import java.util.*;

public class LinkedListCollectionsSort {
    static void printList(LinkedList<String> l){
        Iterator<String> iterator = l.iterator();
        while(iterator.hasNext()){
            String e = iterator.next();
            String separator;
            if(iterator.hasNext())
                separator = "->";
            else
                separator = "\n";
            System.out.print(e+separator);
        }
    }
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("t(^_^t)");
        myList.add("HHH");
        myList.add("War");
        myList.add(0,"Bambi");
        myList.add(2,"Soul");

        Collections.sort(myList);
        printList(myList);

        Collections.reverse(myList);
        printList(myList);

        int idx = Collections.binarySearch(myList,"Soul");
        System.out.println("Soul is in " + idx + "Index");
    }
}
