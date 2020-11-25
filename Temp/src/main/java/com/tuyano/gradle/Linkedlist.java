package com.tuyano.gradle;
import java.util.*;


class Node{
    public int data;
    Node next;
    public Node(int n){
        data=n;
        next= null;
    }
}
class iteratorList{
    public List list;
    public Node current;
    iteratorList(List l){
        list=l;
        current=l.first;
    }
    int First(){
        return current.data;
    }
    int Next(){
        return current.next.data;

    }
    boolean NotNull(){
        if(current==null) return true;
        else return false;
    }
    boolean NextNotNull(){
        if(current.next==null) return true;
        else return false;
    }
    int getLength(){
        int count=0;
        while(current != null){
            count++;
            current=current.next;
        }
        current=this.list.first;
        return count;
    }
    void sort(){
        int min;
        int count=this.getLength();

    }

}
class List {
    public Node first; //Declaring a Variable in a Node

    public List(){ //Generates a node
        first =null;
    }
    public List(int data){ //Sets the data value of the node
//        Node node = new Node(data);
//        first= node;
        first = new Node(data);
    }
    public List(List l){ //Copy list (synchronize)
        first=l.first;

    }
    public List(Node n){ //Set the next of the node and connect it.
        first=n;
    }
    void addBackList(List l){
        Node F,B;
        B=this.first;
        F=B;
        if(B==null )
            this.first=l.first;
        else {// this.first != null
            while (B != null) {
                F = B;
                B = B.next;
            }
            F.next = l.first;
        }
    }
    void addFrontList(List l){
        Node B,F;
        B=l.first;
        F=B;
        while(B != null){
            F=B;
            B=B.next;
        }
        F.next=this.first;
    }

    List mergeList(List l) {
        if(first==null || l.first==null) {
        if(first == null )
            first = l.first;
        else // l.first == null
            l.first = first;
        return this;
        }
        Node bn,fn,temp; //bn=BackNode,fn=FrontNode,cbn=CloneBackNode,cfn=CloneFrontNode
        fn=first;
        bn=l.first;
        while(true){
            temp=bn.next;
            bn.next=fn.next;
            fn.next=bn;
            if(fn.next.next==null){
                fn.next.next=temp;
                break;
            }
            else if(temp==null){
                break;
            }
            bn=temp;
            fn=fn.next.next;

        }
       l.first=first; //Copy yourself to 'List l'
        return this;
    }
    public void addFrontNode(int data){
        Node node = new Node(data);
        if(first==null) {
            first = node;
            return;
        }
        node.next = first;
        first=node;
    }
    public void addBackNode(int data){
        Node node = new Node(data);
        if (first == null) {
            first = node;
            return;
        }
        Node temp = first;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }
    public void showList(){
        Node B = this.first;
        int i = 0;
        while(B != null){
            System.out.println("Index " + i++ + " : " + B.data);
            B = B.next;
        }
        System.out.println();
    }


}
public class Linkedlist {
    public static void MakeList(List l,int num){
            for(int i=1;i<num+1;i++)
                l.addBackNode(i);
    }
    public static void MakeList(List l1,List l2,int num){
        for(int i=0;i<num/2;i++)
            l1.addBackNode(i*2+1);
        for(int i=1;i<num/2;i++)
            l2.addBackNode(i*2);

    }
    public static void main(String[] args) {
        List a1 = new List();
        List a2 = new List();
        List a3 = new List();
        List a4 = new List();
//        List a5 = new List(a4);

//
//
//        MakeList(a1,3);
//        MakeList(a2,2);
//
//        MakeList(a3,3);
//        MakeList(a4,2);
        MakeList(a1,a2,8);
//
//        a1.showList();
//        a2.showList();
//        a3.showList();
//        a4.showList();
//        a5.showList();
//
//
//        a1.addBackList(a2);
//        a3.addFrontList(a4);
//        a1.showList();
//        a4.showList();
//        System.out.println();
        a1.mergeList(a2).showList();
        a2.showList();


    }
}
