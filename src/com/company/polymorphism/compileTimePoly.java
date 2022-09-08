package com.company.polymorphism;

public class compileTimePoly {

    public int area(int s){
        System.out.println("We are in Square{Area}");
        return s*s;
    }
    public double area(int b,int h){
        System.out.println("We are in Triangle{Area}");
        return 0.5*b*h;
    }
    public int area(int l,double b){
        System.out.println("In are in Rectangle{Area}");
        return (int) (l*b);
    }

    public static void main(String[] args) {
        compileTimePoly c=new compileTimePoly();
        System.out.println(c.area(10));
        System.out.println(c.area(2,3));
        System.out.println(c.area(2,3.4));
    }
}
