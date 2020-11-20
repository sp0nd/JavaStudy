package com.tuyano.gradle;
import java.util.*;
class Circle {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class CArray {
    public static void main(String[] args) {
        Random random= new Random();
        int N=random.nextInt(5)+6;

        Circle [] c;
        c = new Circle[N];

        System.out.println("N = "+ N);

        for(int i=0; i<c.length; i++) {
            c[i] = new Circle(i);
            System.out.println("GetArea " + N + " :"+(int)(c[i].getArea()));
        }
    }
}
