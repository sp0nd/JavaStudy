package com.tuyano.CollectionGenerics;
import java.sql.SQLOutput;
import java.util.*;
public class HashMapStringString {
    public static void main(String[] args) {
        HashMap<String,String> wordMeaning =new HashMap<String,String>();

        //key, value
        wordMeaning.put("baby","dkrl");
        wordMeaning.put("love","tkfkd");
        wordMeaning.put("apple","tkrhk");


        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter the word you want to find.");
            String eng = scan.next();
            if(eng.equals("exit")){
                System.out.println("Shut Down System");
                break;
            }
            //Retrieve values by key
            String kor =wordMeaning.get(eng);
            if(kor==null)
                System.out.println(eng + " is a word that does not exist.");
            else
                System.out.println(kor);
        }
        scan.close();
    }
}
