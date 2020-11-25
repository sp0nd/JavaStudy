package com.tuyano.gradle;
class Shape{
    public Shape Next;
    public Shape() {
        Next =null;
    }
    public void draw(){
        System.out.println("Shape");
    }
}

class Line extends Shape{
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class circle extends Shape{
    @Override
    public void draw() {
        System.out.println("circle");
    }
}

public class MethodOverriding {
    static void paint(Shape sp){
        sp.draw();
    }
    public static void main(String[] args) {
        Line line = new Line();

        paint(line);
        paint (new Shape());
        paint (new Line());
        paint (new Rect());
        paint (new circle());

    }
}
