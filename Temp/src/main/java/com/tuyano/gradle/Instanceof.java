package com.tuyano.gradle;

class building{}
class hotel extends building {}
class shoppingmall extends building {}
class restaurant extends shoppingmall {}


public class Instanceof {
    static void print(building B) {
        if(B instanceof building)
            System.out.println("building");
        if(B instanceof hotel)
            System.out.println("hotel");
        if(B instanceof shoppingmall)
            System.out.println("shoppingmall");
        if(B instanceof restaurant)
            System.out.println("restaurant");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("new hotel\t");          print(new hotel());
        System.out.println("new shoppingmall\t");   print(new shoppingmall());
        System.out.println("new restaurant\t");     print(new restaurant());
    }
}
