package com.tuyano.gradle;

public class Birds {
    String name;
    int height;
    double weight;
    double FlightSpeed;

    public Birds(String n,int a, double b, double c) {
        name=n;
        height=a;
        weight=b;
        FlightSpeed=c;
    }

    public double kinetic() {
        System.out.print(name + " : ");
        return weight*FlightSpeed*FlightSpeed;
    }

    public static void main(String[] args) {
        Birds Eagle=new Birds("Eagle",120,40.0,110.0);
        Birds crow=new Birds("crow",80,20.0,90.0);
        Birds sparrow=new Birds("sparrow",15,4.0,20.0);
        Birds hawk=new Birds("hawk",210,100.0,140.0);


        System.out.println("===========Birds Kinetic Energy===========");
        System.out.println(Eagle.kinetic());
        System.out.println(crow.kinetic());
        System.out.println(sparrow.kinetic());
        System.out.println(hawk.kinetic());

    }
}
