package com.tuyano.CollectionGenerics;

public class GenericsMethod {
    public static <T> GenericsStack<T> reverse(GenericsStack<T> a){
        GenericsStack<T> s = new GenericsStack<T>();
        while(true){
            T tmp;
            tmp = a.pop();
            if(tmp == null)
                break;
            else
                s.push(tmp);
        }
        return s;
    }

    public static void main(String[] args) {
        GenericsStack<Double> gs = new GenericsStack<Double>();

        for(int i=0;i<5;i++)
            gs.push(new Double(i));
        gs = reverse(gs);
        for(int i=0;i<5;i++)
            System.out.println(gs.pop());
    }
}
