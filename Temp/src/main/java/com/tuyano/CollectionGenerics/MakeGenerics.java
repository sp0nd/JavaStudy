package com.tuyano.CollectionGenerics;
class GenericsStack<T>{
    int tos;
    Object[] stack;
    GenericsStack(){
        tos=0;
        stack=new Object[10];
    }
    void push(T item){
        if(tos == 10)
            return;
        stack[tos] = item;
        tos++;
    }
    T pop(){
        if(tos==0) return null;
        tos--;
        return (T)stack[tos];// typecasting
    }
}
public class MakeGenerics {
    public static void main(String[] args) {
        GenericsStack<String> stringStack = new GenericsStack<String>();

        stringStack.push("Seoul");
        stringStack.push("BuSan");
        stringStack.push("LA");
        for(int i=0; i<3;i++)
            System.out.println(stringStack.pop());
        GenericsStack<Integer> intStack = new GenericsStack<Integer>();
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for(int n=0; n<3;n++) System.out.println(intStack.pop());
    }
}
