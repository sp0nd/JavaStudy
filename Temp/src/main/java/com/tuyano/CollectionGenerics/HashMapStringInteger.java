package com.tuyano.CollectionGenerics;
import java.util.*;
public class HashMapStringInteger {
    public static void main(String[] args) {
        HashMap<String,Integer> scoreMap = new HashMap<String,Integer>();

        scoreMap.put("kkk",97);
        scoreMap.put("ttt",88);
        scoreMap.put("jjj",98);
        scoreMap.put("lll",70);
        scoreMap.put("asd",99);

        System.out.println("HashMap Element Count : "+ scoreMap.size());

        //All (key, value) outputs of 'S'
        Set<String> keys = scoreMap.keySet();//Returns 'set' with all 'key'
        Iterator<String> it = keys.iterator();//set에 있는 모든 key 를 순서대로 검색한는 iterator 리턴

        while(it.hasNext()){
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name + " : " + score);
        }
    }
}
