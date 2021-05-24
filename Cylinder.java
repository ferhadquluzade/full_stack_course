package com.company;

public class Cylinder extends Circle{
double height;

    public Cylinder(double height,double x,double y,double rad) {
     super(x,y,rad);
     this.height=height;
}

    public Cylinder(double x, double y, double rad) {
        super(x, y, rad);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }
    public String  toString(){
        return super.toString()+",height:"+this.height;
    }
    public double volume(){
        return area()*getHeight();
    }
    public static void main(String[] args) {
        System.out.println(new Cylinder(1.5,16,23,2).volume());
    }
}
