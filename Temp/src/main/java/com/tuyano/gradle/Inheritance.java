package com.tuyano.gradle;
class Person{
    public String name;
    int age;
    protected int height;
    int weight; // private >> local
    Person(){}
    Person(String N, int A, int H, int W ){
        name=N;
        age=A;
        height=H;
        weight=W;
    }

    void show(String select){
        if(select=="All"){
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Height : " + height);
            System.out.println("Weight : " + weight);
        }
        else if(select=="N")
            System.out.println("Name : " + name);
        else if(select=="A")
            System.out.println("Age : " + age);
        else if(select=="H")
            System.out.println("Height : " + height);
        else
            System.out.println("Weight : "+weight);
    }
}
class Student extends Person{
    private int StudentNum;
    public int Class;
    Student(int CS,int SN){
        StudentNum=SN;
        Class=CS;
    }
    Student(String N, int A, int H,int W){
        super(N, A, H, W);
    }

    void show(String select){
        if(select=="All"){
            System.out.println("Class : " + Class);
            System.out.println("StudentNum : " + StudentNum);
            super.show(select);
//            System.out.println("Name : " + name);       //public
//            System.out.println("Age : " + age);         //Local
//            System.out.println("Height : " + height);   //protected
//            System.out.println("Weight : " + weight);   //private >> Local
        }
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Person p = new Person("Kim",27,1000,1000);
        Student St1 = new Student(4,2020940331);
        Student St2 = new Student("Tae",26,2000,2000);
        System.out.println("------Person------");
        p.show("All");
        System.out.println("------Student1------");
        St1.show("All");
        System.out.println("------Student2------");
        St2.show("All");

    }
}
