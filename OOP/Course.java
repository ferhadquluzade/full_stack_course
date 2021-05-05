package com.company;

public class Course {
    Teacher teacher;
    Student[] students;
    public  Course(Teacher teacher,int size){
        this.teacher=teacher;
        this.students= new Student[size];
    }
    public Teacher getTeacher(){
        return this.teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public Student[] getStudents(){
        return this.students;
    }
    public void setStudents(Student[] student){
        this.students=students;
    }
}
