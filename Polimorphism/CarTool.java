package com.company;

public class CarTool extends Tool{
    private int width;
    public CarTool(String color, int price,int width) {
        super(color, price);
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int newWidth){
        width=newWidth;
    }
    public String toString(){
        return String.format("color: %s,price: %d,width: %d",color,price,width);
    }
    @Override
    public int payCustom() {
        return (int) (price*0.5);
    }
}
