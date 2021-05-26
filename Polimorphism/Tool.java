package com.company;

public abstract class Tool {
    protected int price;
    protected String color;
    public Tool(String color,int price){
        this.price=price;
        this.color=color;
    }
    public int getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    public void setPrice(int newPrice){
        price=newPrice;
    }
    public void setColor(String newColor){
        color=newColor;
    }
    public String toString(){
        return String.format("Price: %d,Color: %s",price,color);
    }
    public abstract int payCustom();

}
