package com.company;


public class Main {

    public static void main(String[] args) {
University Azi=new University("Azi",3);
        Azi.courses[0]=new Course(new Teacher("fiko",4),5);
        Azi.courses[0].students[0]=new Student("Ferhad",0);
        System.out.println(Azi.courses[0].teacher.name+","+Azi.courses[0].students[0].name);
    }
}