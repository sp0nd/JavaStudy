package com.tuyano.CollectionGenerics;

import java.util.Vector;
class Point{
    private int x,y;
    public Point(int X,int Y){
        x=X; y=Y;
    }
    public String toString(){
        return "(" +x+","+y+")";
    }
}

public class VectorPoint {
    public static void main(String[] args) {
        Vector<Point> v =new Vector<Point>();

        v.add(new Point(2,3));
        v.add(new Point(-5,20));
        v.add(new Point(30,-8));

        v.remove(1);// Delete objects in index location

        //Output all point objects in vectors
        for(int i=0;i<v.size();i++){
            Point p = v.get(i);//Acquire an i-point object for vectors
            System.out.println(p);//p output object p.toString()
        }
    }
}
