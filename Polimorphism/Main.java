package com.company;

public class Main {

    public static void main(String[] args) {
        Tool[] tools = {
                new GardenTool("red", 10, 2),
                new GardenTool("white", 15, 5),
                new CarTool("green", 20, 10),
                new CarTool("black", 25, 15)};
        for (Tool tool : tools) {
            if (tool instanceof CarTool) {
                System.out.println(tool);
            }
        }
    }
}
