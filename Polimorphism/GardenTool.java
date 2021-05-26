package com.company;

public class GardenTool extends Tool {

    private int depth;

    public GardenTool(String color, int price, int depth) {
        super(color, price);
        this.depth = depth;
    }

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int newDepth) {
        depth = newDepth;
    }

    public String toString() {
        return String.format("price: %d,color: %s,depth: %d", price, color, depth);
    }

    @Override
    public int payCustom() {
        return (int) (this.getPrice() * 0.2);
    }

}
