package com.company;

public class Circle {
    public   double x=5;
    private double y;
    private double rad;
    public Circle(double x,double y,double rad){
        this.x=x;
        this.y=y;
        this.rad=rad;
    }

    public double getX(){
        return this.x;
    }
    public double getY() {
        return y;
    }
    public double getRad(){
        return this.rad;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setRad(double rad){
        this.rad=rad;
    }
    public String toString(){
        return "x:"+this.x+",y:"+this.y+",rad:"+this.rad;
    }
    public double area(){
        return  Math.PI*this.rad*this.rad;
    }
    public String prmtr(){
        return "Parameter:"+(2*Math.PI*this.rad);
    }

    public static void main(String[] args) {
        Circle c=new Circle(10,20,4);
        System.out.println(c.area());


    }
}


