package com.tuyano.gradle;
interface containerInterface{
    public boolean IsEmpty();
    public boolean IsFull();
    public int Element();
    public void Push(int n);
    public int Pop();
}
class MyQueue implements containerInterface{
    int movePoint,size,temp;
    int[] queue;
    MyQueue(int Size){
        size=Size;
        queue = new int[size];
        movePoint=0;
    }
    public boolean IsEmpty(){return movePoint==0; }
    public boolean IsFull(){return movePoint==size;}
    public int Element(){
        for(int i=0;i<movePoint;i++)
            System.out.println(queue[i]);

        if(IsFull()) System.out.println("Queue is Full");
        if(IsEmpty()) System.out.println("Queue is Empty");
        System.out.println();
        return 1;
    }
    public void Push(int n){
        if(IsFull()) return;
        queue[movePoint++]=n;
    };
    public int Pop(){
        if(IsEmpty()) return 1;
        else {
            temp = queue[0];
            for (int i = 1; i < movePoint; i++) {
                queue[i - 1] = queue[i];
            }
            movePoint--;
        }
        return 1;
    };
}
public class InterfaceQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.Push(1);
        queue.Push(2);
        queue.Push(3);
        queue.Push(4);
        queue.Push(5);
        queue.Element();


        queue.Pop();
        queue.Element();
        queue.Push(5);
        queue.Element();
        queue.Pop();
        queue.Pop();
        queue.Pop();
        queue.Pop();
        queue.Pop();
        queue.Element();
    }
}
