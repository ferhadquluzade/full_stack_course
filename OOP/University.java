package com.company;

public class University {
    String name;
    Course[] courses;
    public University(String name,int size){
        this.name=name;
        this.courses=new Course[size];
      }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Course[] getCourses(){
        return  this.courses;
    }
    public void setCurses(Course[] courses){
        this.courses=courses;
    }



}
//TODO:array le arrayi toplamaq,beraber elemek
//TODO:char ile chari toplamaq,beraber elemek
//TODO:array le arrayi toplamaq,beraber elemek
//TODO:array le arrayi toplamaq,beraber elemek
