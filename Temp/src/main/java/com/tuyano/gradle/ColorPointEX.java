package com.tuyano.gradle;
import javax.swing.plaf.ColorUIResource;
import java.util.*;
class Point{

    private int x,y;

    Point(){}
    Scanner scan = new Scanner(System.in);
    public void Pointsetting(int X ,int Y){
        x=X;
        y=Y;
    }
    public void ShowPoint(){
        System.out.println("Setting Point : " + "(" + x + "," + y + ")");
    }
}
class ColorPoint extends Point{
    private int N,M;
    private String color;
    ColorPoint(){
        System.out.println("Enter Point :");
        N=scan.nextInt();
        M=scan.nextInt();
        Pointsetting(N,M);
        scan.nextLine();
    }


    void setColor(){
        System.out.println("Enter Color " );
        color=scan.nextLine();
    }
    void ShowColorPoint(){
        System.out.println("Color : " + color);
        ShowPoint();
    }
}
public class ColorPointEX {
    public static void main(String[] args) {

        Point p= new Point();
        p.Pointsetting(1,2);
        p.ShowPoint();
        ColorPoint cp = new ColorPoint();
        cp.setColor();
        cp.ShowColorPoint();
    }
}