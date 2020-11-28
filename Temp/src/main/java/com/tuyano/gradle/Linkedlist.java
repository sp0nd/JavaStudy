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
class Iterator{
    public List list;
    public Node current;
    Iterator(List l){
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

}
class List {
    public Iterator iterator;
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
    List addBackList(List l){
        Node saveNode,thisNode;
        thisNode=this.first;
        saveNode=thisNode;
        if(thisNode==null )
            this.first=l.first;
        else {// this.first != null
            while (thisNode != null) {
                saveNode = thisNode;
                thisNode = thisNode.next;
            }
            saveNode.next = l.first;
        }
        return this;
    }
    List addFrontList(List l){
        Node saveNode,thisNode;
        thisNode=l.first;
        saveNode=thisNode;
        if(thisNode==null)
            return this;
        else {
            while (thisNode != null) {
                saveNode = thisNode;
                thisNode = thisNode.next;
            }
            saveNode.next=this.first;
        }

        return this;
    }

    List SimpleMergeList(List l) {
        if(first==null || l.first==null) {
            if (first == null)
                first = l.first;
            else // l.first == null
                l.first = first;
            return this;
        }
        Node thisNode,defaultNode,saveNode; //bn=BackNode,fn=FrontNode,cbn=CloneBackNode,cfn=CloneFrontNode
        thisNode=first;
        defaultNode=l.first;
        while(true){
            saveNode=defaultNode.next;
            defaultNode.next=thisNode.next;
            thisNode.next=defaultNode;
            if(thisNode.next.next==null){
                thisNode.next.next=saveNode;
                break;
            }
            thisNode=thisNode.next.next;
            if(saveNode==null){
                break;
            }
            defaultNode=saveNode;

        }
        l.first=first; // Copy itself to 'List l'
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
        Node thisNode = this.first;
        int i = 0;
        while(thisNode != null){
            System.out.println("Index " + i++ + " : " + thisNode.data);
            thisNode = thisNode.next;
        }
        System.out.println();
    }
    public void showList(int a){
        Node thisNode = this.first;
        int i = 0;
        while(thisNode != null){
            System.out.println("Index " + i++ + " : " + thisNode.data);
            thisNode = thisNode.next;
        }
    }
    List sort(){
        if (first == null) {
            System.out.println("This list is empty.");
            return this;
        }
        int count = this.getLength();
        Node thisNode;
        Node preNode;
        int min;
        Node minNode = null;
        Node minpreNode = null;
        for (int i = 0; i < count; i++) {
            thisNode = first;
            preNode = null;
            min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                preNode = thisNode;
                thisNode = thisNode.next;
            }
            while (thisNode != null) {
                if (min > thisNode.data) {
                    min = thisNode.data;
                    minpreNode = preNode;
                    minNode = thisNode;
                }
                preNode = thisNode;
                thisNode = thisNode.next;
            }
            if (i == 0) {
                minpreNode.next = minNode.next;
                minNode.next = first;
                first = minNode;
            } else {
                thisNode = first;
                preNode = null;
                for (int j = 0; j < i; j++) {
                    preNode = thisNode;
                    thisNode = thisNode.next;
                }
                if (thisNode == minNode) {
                    continue;
                } else {
                    minpreNode.next = minNode.next;
                    minNode.next = preNode.next;
                    preNode.next = minNode;
                }
            }
        }
        return this;
    }
    int getLength(){
        Node node=first;
        int count=0;
        while(node != null){
            count++;
            node=node.next;
        }
        return count;

    }
    void simpleSplit(List l){
        Node temp = first;
        int Length = this.getLength()/2;
        int count=1;
        while( count !=Length ) {
            temp = temp.next;
            count++;
        }
        l.first=temp.next;
        temp.next=null;
    }
    void MergeList(List l){
        this.SimpleMergeList(l).sort();
        l.first=this.first;
    }
    List[] Split(List[] a){
        for(int i=0;i<this.getLength();i++) a[i]=new List();
        a[0]=this;
        int count=0,idx=1;
        while(a.length != this.getLength()) {
            a[count].SimpleMergeList(a[idx++]);
            if(a[count].getLength()==1) count++;
        }
        return a;
    }

    void MakeList(int num){
        List l=this;
        Random random = new Random();
        for(int i=1;i<num+1;i++)
            l.addBackNode(random.nextInt(100));
    }

}
public class Linkedlist {
    public static void MakeList(List l,int num){
            for(int i=1;i<num+1;i++)
                l.addBackNode(i);
//            for(int i=1;i<num+1;i++)
//                l.addFrontNode(i);
    }
    public static void MakeList(List l1,List l2,int num){
        for(int i=0;i<num/2;i++)
            l1.addBackNode(i*2+1);
        for(int i=0;i<num/2;i++)
            l2.addBackNode(i*2);

    }
    public static void main(String[] args) {

        List a1 = new List();
        List a2 = new List();




/////////////////////////////////////////////////////////////
//        //addBackList AddFrontList start
//
//        a1.addBackNode(13);a1.addBackNode(193);a1.addBackNode(4);a1.addBackNode(50);a1.addBackNode(83);
//        a2.addBackNode(100);a2.addBackNode(10);a2.addBackNode(7);a2.addBackNode(21);a2.addBackNode(1);
//        a1.addBackList(a2);
//        a1.addFrontList(a2);
//
//        a1.showList();
//        a2.showList();
//        //addBackList AddFrontList End
/////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////
//        //MergeList Start
//
//        a1.addBackNode(13);a1.addBackNode(193);a1.addBackNode(4);a1.addBackNode(50);a1.addBackNode(83);
//        a2.addBackNode(100);a2.addBackNode(10);a2.addBackNode(7);a2.addBackNode(21);a2.addBackNode(1);
//        a1.showList();
//        a2.showList();
//        a1.MergeList(a2);
//        a1.showList();
//        a2.showList();
//
//        //SimpleMerge End
/////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////
//  // SimpleSplit start
//
//        MakeList(a1,10);
//        a1.showList();
//
//        a1.simpleSplit(a2);
//        a1.showList();
//        a2.showList();
//
//  // SimpleSplit end
/////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////
//     SimpleMergeList start
//
//     MakeList(a1,a2,8);
//     a1.showList();
//     a2.showList();
//
//     a1.SimpleMergeList(a2).showList();
//     a2.showList();
//
////      MergeList start
/////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////
//        Split start
//
//        a1.MakeList(10);
//        List[] a=new List[a1.getLength()];
//
//        a1.Split(a);
//        for(int i=0;i<a1.getLength();i++)
//        a[i].showList(3);
//
//        Split end
/////////////////////////////////////////////////////////////
    }
}
