package com.company.polymorphism;

public class Main {
    public static void main(String[] args) {
//        ShapesRT s = new ShapesRT();
//        Circle c = new Circle();
//        Square sq = new Square();
//        Triangle t = new Triangle();
        //runTime
        ShapesRT s1 = new Circle();
        ShapesRT s2 = new Square();
        ShapesRT s3 = new Triangle();
        s1.area();
        s2.area();
        s3.area();
    }
}
