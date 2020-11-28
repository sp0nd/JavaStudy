package com.tuyano.gradle;

import java.util.*;

abstract class ContainerInterface{
    int size;
    int top;
    abstract public boolean IsEmpty();
    abstract public boolean IsFull();
    abstract public int Element();
    abstract public void Push(int n);
    abstract public int Pop();
}
class MyStack extends ContainerInterface {
    int[] stack;

    public MyStack(int Size){
        size=Size;
        top=-1;
        stack = new int[size];
    }
    public int Element(){
        for(int i=0;i<top+1;i++)
            System.out.println(stack[i]);
        System.out.println();
        if(top==-1) System.out.println("Empty");
        return 0;
    }
    public void Push(int n){
        if(!IsFull()) stack[++top]=n;
        else System.out.println("Stack is Full");
    }
    public int Pop(){
        if(!IsEmpty()) return stack[top--];
        System.out.println("Stack is Empty");
        return 0;
    }
    public boolean IsEmpty(){return size==0;}
    public boolean IsFull(){return size-1==top;}
}
public class AbstractStack {
    public static void main(String[] args) {
        MyStack mystack = new MyStack(5);

        mystack.Push(9);
        mystack.Push(8);
        mystack.Push(7);
        mystack.Push(6);
        mystack.Push(5);
        mystack.Element();
        mystack.Pop();
        mystack.Pop();
        mystack.Pop();
        mystack.Element();
        mystack.Push(11);
        mystack.Push(10);
        mystack.Element();
        mystack.Pop();
        mystack.Pop();
        mystack.Pop();
        mystack.Pop();
        mystack.Element();


    }
}
