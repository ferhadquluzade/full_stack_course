package com.company;

public class Student {
    String name;
    int id;
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
    public void setName(int id){
        this.id=id;
    }

}
